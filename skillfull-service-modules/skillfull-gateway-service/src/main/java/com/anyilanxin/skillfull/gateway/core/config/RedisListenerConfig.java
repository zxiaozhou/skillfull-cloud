package com.anyilanxin.skillfull.gateway.core.config;

import com.anyilanxin.skillfull.corecommon.constant.RedisSubscribeConstant;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.connection.ReactiveSubscription;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.ReactiveRedisMessageListenerContainer;

/**
 * redis订阅监听监听
 *
 * @author zxiaozhou
 * @date 2021-01-25 21:20
 * @since JDK11
 */
@Configuration
@Slf4j
@RequiredArgsConstructor
public class RedisListenerConfig {
    private final RedisSubscribeListener redisSubscribeListener;


    @Bean
    ReactiveRedisMessageListenerContainer container(ReactiveRedisConnectionFactory connectionFactory) {
        ReactiveRedisMessageListenerContainer container = new ReactiveRedisMessageListenerContainer(connectionFactory);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            container.destroyLater().subscribe();
        }));
        container.receive(reloadTopic())
                .map(ReactiveSubscription.Message::getMessage)
                .subscribe(redisSubscribeListener::reloadRouter);
        container.receive(updateTopic())
                .map(ReactiveSubscription.Message::getMessage)
                .subscribe(redisSubscribeListener::updateRouter);
        container.receive(deleteTopic())
                .map(ReactiveSubscription.Message::getMessage)
                .subscribe(redisSubscribeListener::deleteRouter);
        return container;
    }


    @Bean
    public ChannelTopic reloadTopic() {
        return new ChannelTopic(RedisSubscribeConstant.GATEWAY_ROUTER_INFO_RELOAD);
    }


    @Bean
    public ChannelTopic updateTopic() {
        return new ChannelTopic(RedisSubscribeConstant.GATEWAY_ROUTER_INFO_UPDATE);
    }


    @Bean
    public ChannelTopic deleteTopic() {
        return new ChannelTopic(RedisSubscribeConstant.GATEWAY_ROUTER_INFO_DELETE);
    }

}

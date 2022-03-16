package indi.zxiaozhou.skillfull.gateway.core.config;

import indi.zxiaozhou.skillfull.corecommon.base.service.ICoreCommonService;
import indi.zxiaozhou.skillfull.gateway.core.config.listener.ConstantDeleteEventListener;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

/**
 * redis监听配置
 *
 * @author zxiaozhou
 * @date 2021-07-09 21:47
 * @since JDK1.8
 */

@Configuration
@RequiredArgsConstructor
public class RedisGatewayConfiguration {
    private final RedisMessageListenerContainer redisMessageListenerContainer;
    private final ICoreCommonService coreCommonService;


    @Bean
    public ConstantDeleteEventListener constantDeleteEventListener() {
        return new ConstantDeleteEventListener(redisMessageListenerContainer, coreCommonService);
    }

}

package com.anyilanxin.skillfull.gateway.core.config.properties;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Set;

import static com.anyilanxin.skillfull.corecommon.constant.CommonCoreConstant.PRO;

@Component
@ConfigurationProperties(prefix = "resource")
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class CustomSecurityProperties {
    /**
     * 当前环境
     */
    @Value("${spring.profiles.active:" + PRO + "}")
    private String active;
    /**
     * 打开鉴权,默认关闭
     */
    private boolean enabled;
    /**
     * 公共白名单
     */
    private Set<String> commonWhiteList;
    /**
     * 开发白名单
     */
    private Set<String> devWhiteList;
    /**
     * 正式环境白名单
     */
    private Set<String> proWhiteList;
    /**
     * 测试环境白名单
     */
    private Set<String> testWhiteList;

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
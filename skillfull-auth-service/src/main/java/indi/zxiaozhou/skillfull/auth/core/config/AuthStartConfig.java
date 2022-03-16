// +----------------------------------------------------------------------
// | SkillFull快速开发平台 [ SkillFull ]
// +----------------------------------------------------------------------
// | 版权所有 2020~2021 zxiaozhou
// +----------------------------------------------------------------------
// | 官方网站: https://www.divisu.com
// +----------------------------------------------------------------------
// | 作者: zxiaozhou <z7630853@163.com>
// +----------------------------------------------------------------------
package indi.zxiaozhou.skillfull.auth.core.config;


import indi.zxiaozhou.skillfull.auth.modules.rbac.service.IRbacPermissionService;
import indi.zxiaozhou.skillfull.corecommon.base.service.ICoreCommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 启动处理
 *
 * @author zxiaozhou
 * @date 2019-04-16 10:38
 * @since JDK11
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class AuthStartConfig implements ApplicationRunner {
    private final IRbacPermissionService permissionService;
    private final ICoreCommonService coreCommonService;


    @Override
    public void run(ApplicationArguments args) {
        // 通知系统服务刷新权限
        log.debug("------------StartConfig------------>loadRoute:{}", "开始通知刷新权限");
        permissionService.refreshAuth(false);
        // 加载常量字典
        coreCommonService.loadConstantDict(false);
    }

}

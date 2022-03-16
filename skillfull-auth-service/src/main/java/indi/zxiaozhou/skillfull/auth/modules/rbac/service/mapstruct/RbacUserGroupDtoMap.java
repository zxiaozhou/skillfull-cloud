// +----------------------------------------------------------------------
// | SkillFull快速开发平台 [ SkillFull ]
// +----------------------------------------------------------------------
// | 版权所有 2020~2021 zxiaozhou
// +----------------------------------------------------------------------
// | 官方网站: https://www.divisu.com
// +----------------------------------------------------------------------
// | 作者: zxiaozhou <z7630853@163.com>
// +----------------------------------------------------------------------
package indi.zxiaozhou.skillfull.auth.modules.rbac.service.mapstruct;

import indi.zxiaozhou.skillfull.auth.modules.rbac.entity.RbacUserGroupEntity;
import indi.zxiaozhou.skillfull.auth.modules.rbac.service.dto.RbacUserGroupDto;
import indi.zxiaozhou.skillfull.corecommon.base.service.mapstruct.BaseMap;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * 用户组(RbacUserGroup)Dto与Entity相互转换
 *
 * @author zxiaozhou
 * @since 2021-05-17 23:13:08
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true))
public interface RbacUserGroupDtoMap extends BaseMap<RbacUserGroupDto, RbacUserGroupEntity> {
}
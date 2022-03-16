// +----------------------------------------------------------------------
// | SkillFull快速开发平台 [ SkillFull ]
// +----------------------------------------------------------------------
// | 版权所有 2020~2021 zxiaozhou
// +----------------------------------------------------------------------
// | 官方网站: https://www.divisu.com
// +----------------------------------------------------------------------
// | 作者: zxiaozhou <z7630853@163.com>
// +----------------------------------------------------------------------
package indi.zxiaozhou.skillfull.auth.modules.common.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import indi.zxiaozhou.skillfull.auth.modules.common.controller.vo.CommonSystemPageVo;
import indi.zxiaozhou.skillfull.auth.modules.common.entity.CommonSystemEntity;
import indi.zxiaozhou.skillfull.auth.modules.common.service.dto.CommonSystemPageDto;
import indi.zxiaozhou.skillfull.coredatabase.base.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * 系统(CommonSystem)持久层
 *
 * @author zxiaozhou
 * @date 2021-07-28 10:13:05
 * @since JDK1.8
 */
@Repository
public interface CommonSystemMapper extends BaseMapper<CommonSystemEntity> {
 /**
  * 分页查询
  *
  * @param vo   ${@link CommonSystemPageVo} 查询条件
  * @param page ${@link Page<CommonSystemPageDto>} 分页信息
  * @return IPage<CommonSystemPageDto> ${@link IPage<CommonSystemPageDto>} 结果
  * @author zxiaozhou
  * @date 2021-07-28 10:13:05
  */
 IPage<CommonSystemPageDto> pageByModel(Page<CommonSystemPageDto> page, @Param("query") CommonSystemPageVo vo);


 /**
  * 通过系统id物理删除
  *
  * @param systemId ${@link String} 系统id
  * @return int ${@link Integer} 成功状态:0-失败,1-成功
  * @author zxiaozhou
  * @date 2021-07-28 10:13:05
  */
 int physicalDeleteById(@Param("id") String systemId);


 /**
  * 通过系统id物理批量删除
  *
  * @param idList ${@link Collection} 待删除id
  * @return int ${@link Integer} 成功状态:0-失败,大于1-成功
  * @author zxiaozhou
  * @date 2021-07-28 10:13:05
  */
 int physicalDeleteBatchIds(@Param("coll") Collection<String> idList);
}

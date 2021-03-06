// +----------------------------------------------------------------------
// | SkillFull快速开发平台 [ SkillFull ]
// +----------------------------------------------------------------------
// | 版权所有 2020~2021 zxiaozhou
// +----------------------------------------------------------------------
// | 官方网站: https://www.divisu.com
// +----------------------------------------------------------------------
// | 作者: zxiaozhou <z7630853@163.com>
// +----------------------------------------------------------------------
package com.anyilanxin.skillfull.messageapi.model;

import com.anyilanxin.skillfull.messageapi.constant.impl.StreamSocketBusinessType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * 发送消息
 *
 * @author zxiaozhou
 * @date 2022-04-07 15:19
 * @since JDK1.8
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@SuperBuilder(toBuilder = true)


@NoArgsConstructor
public class StreamMsgModel implements Serializable {
    private static final long serialVersionUID = -3931714024892969626L;
    /**
     * 消息类型
     */
    private StreamSocketBusinessType businessType;

    /**
     * 消息业务数据
     */
    private String msgData;

    /**
     * 消息唯一序号
     */
    private String uniqueId;

    /**
     * 发送消息的sessionId（socket发出的流时存在）
     */
    private String sessionId;
}

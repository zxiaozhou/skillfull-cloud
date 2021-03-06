// +----------------------------------------------------------------------
// | SkillFull快速开发平台 [ SkillFull ]
// +----------------------------------------------------------------------
// | 版权所有 2020~2021 zxiaozhou
// +----------------------------------------------------------------------
// | 官方网站: https://www.divisu.com
// +----------------------------------------------------------------------
// | 作者: zxiaozhou <z7630853@163.com>
// +----------------------------------------------------------------------
package com.anyilanxin.skillfull.message.modules.stream.impl;

import com.anyilanxin.skillfull.message.modules.stream.IStreamMessageStrategy;
import com.anyilanxin.skillfull.messageapi.constant.StreamSocketBusinessConstant;
import com.anyilanxin.skillfull.messageapi.model.StreamMsgModel;
import org.springframework.stereotype.Component;

import javax.websocket.Session;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 系统消息
 *
 * @author zxiaozhou
 * @date 2022-03-29 17:36
 * @since JDK1.8
 */
@Component(StreamSocketBusinessConstant.SYSTEM_NOTICE)
public class SystemMsgMessageStrategyImpl implements IStreamMessageStrategy {
    @Override
    public void processMessage(StreamMsgModel streamMsgModel, ConcurrentHashMap<String, Session> socketSessionsCache) {

    }
}

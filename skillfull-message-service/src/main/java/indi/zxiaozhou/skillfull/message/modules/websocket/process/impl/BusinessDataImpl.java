// +----------------------------------------------------------------------
// | SkillFull快速开发平台 [ SkillFull ]
// +----------------------------------------------------------------------
// | 版权所有 2020~2021 zxiaozhou
// +----------------------------------------------------------------------
// | 官方网站: https://www.divisu.com
// +----------------------------------------------------------------------
// | 作者: zxiaozhou <z7630853@163.com>
// +----------------------------------------------------------------------
package indi.zxiaozhou.skillfull.message.modules.websocket.process.impl;

import indi.zxiaozhou.skillfull.corecommon.base.SocketResult;
import indi.zxiaozhou.skillfull.corecommon.constant.SysBaseConstant;
import indi.zxiaozhou.skillfull.message.modules.websocket.model.WebSocketLinkModel;
import indi.zxiaozhou.skillfull.message.modules.websocket.process.IMessageStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 处理请求业务数据
 *
 * @author zxiaozhou
 * @date 2021-04-02 09:58
 * @since JDK1.8
 */
@Component(SysBaseConstant.SOCKET_MSG_TYPE_PREFIX + 3)
@Slf4j
public class BusinessDataImpl implements IMessageStrategy {
    @Override
    public void processMessage(ConcurrentHashMap<String, WebSocketLinkModel> socketMap, SocketResult model, WebSocketLinkModel webSocketLinkModel) {
        log.debug("------------BusinessDataImpl------处理请求业务数据消息------>processMessage:{}", model);
    }
}

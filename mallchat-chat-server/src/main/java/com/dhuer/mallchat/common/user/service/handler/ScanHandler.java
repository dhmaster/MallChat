package com.dhuer.mallchat.common.user.service.handler;

import com.dhuer.mallchat.common.user.service.WXMsgService;
import com.dhuer.mallchat.common.user.service.adapter.TextBuilder;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.stereotype.Component;

import java.net.URLEncoder;
import java.util.Map;

/**
 * 扫码事件处理
 */
@Component
public class ScanHandler extends AbstractHandler {

    @Autowired
    private WXMsgService wxMsgService;
    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMpXmlMessage, Map<String, Object> map,
                                    WxMpService wxMpService, WxSessionManager wxSessionManager) throws WxErrorException {
        return wxMsgService.scan(wxMpXmlMessage);

        // TODO 扫码
        }
}
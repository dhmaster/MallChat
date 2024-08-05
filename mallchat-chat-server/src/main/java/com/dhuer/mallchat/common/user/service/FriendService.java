package com.dhuer.mallchat.common.user.service;

import com.dhuer.mallchat.common.common.domain.vo.req.CursorPageBaseReq;
import com.dhuer.mallchat.common.common.domain.vo.resp.CursorPageBaseResp;
import com.dhuer.mallchat.common.user.domain.vo.req.friend.FriendApplyReq;
import com.dhuer.mallchat.common.user.domain.vo.req.friend.FriendApproveReq;
import com.dhuer.mallchat.common.user.domain.vo.resp.friend.FriendResp;

/**
 * <p>
 * 好友
 * </p>
 *
 * @author <a href="https://github.com/dhmaster/MallChat.git">Jintao_L</a>
 * @since 2024-07-07
 */
public interface FriendService {
    /**
     * 好友列表
     * @param uid
     * @param request
     * @return
     */
    CursorPageBaseResp<FriendResp> friendList(Long uid, CursorPageBaseReq request);

    /**
     * 申请好友
     * @param uid
     * @param request
     */
    void apply(Long uid, FriendApplyReq request);

    /**
     * 同意好友申请
     * @param uid
     * @param request
     */
    void applyApprove(Long uid, FriendApproveReq request);
}

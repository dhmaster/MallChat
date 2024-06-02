package com.dhuer.mallchat.common.user.service;

import com.dhuer.mallchat.common.user.domain.entity.User;
import com.dhuer.mallchat.common.user.domain.enums.RoleEnum;
import com.dhuer.mallchat.common.user.domain.vo.resp.BadgeResp;
import com.dhuer.mallchat.common.user.domain.vo.resp.UserInfoResp;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author <a href="https://github.com/dhmaster/MallChat.git">Jintao_L</a>
 * @since 2024-06-01
 */
public interface RoleService {
    /**
     * 是否拥有某个权限 临时写法
     */
    boolean hasRight(Long uid, RoleEnum roleEnum);
}

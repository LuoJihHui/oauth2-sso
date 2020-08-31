package com.ljh.auth.server.mapper;

import com.ljh.auth.server.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LuoJiaHui
 * @date 2020/8/31 15:56
 * @description
 */
public interface UserMapper extends JpaRepository<UserInfo, Long> {

    /**
     * @param username
     * @return com.ljh.auth.server.entity.UserInfo
     * @auth LuoJiaHui
     * @Date 2020/8/31 15:58
     **/
    UserInfo findByUsername(String username);
}

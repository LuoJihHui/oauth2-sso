package com.ljh.auth.server.service;

import com.ljh.auth.server.entity.UserInfo;
import com.ljh.auth.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author LuoJiaHui
 * @date 2020/8/31 15:56
 * @description
 */
@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = userMapper.findByUsername(username);
        if (userInfo == null) {
            throw new UsernameNotFoundException("未查询该用户");
        }
        return userInfo;
    }
}

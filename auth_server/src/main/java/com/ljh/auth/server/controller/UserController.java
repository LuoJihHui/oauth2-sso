package com.ljh.auth.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author LuoJiaHui
 * @date 2020/8/31 16:02
 * @description
 */
@RestController
public class UserController {

    @GetMapping("/user")
    public Principal getCurrentUser(Principal principal) {
        return principal;
    }
}

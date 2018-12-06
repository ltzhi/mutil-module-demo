package com.simonluo.bus.controller;

import com.simonluo.common.bean.BaseUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author simonluo
 * @Date 12/5/2018 1:59 PM
 * @Version 1.0
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public BaseUser test() {
        BaseUser user = new BaseUser();
        user.setId("TEST");
        user.setLogin("easewalk");
        user.setNickName("SimonLuo");
        return user;
    }
}

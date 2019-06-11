package com.qfedu.demo.web;

import com.qfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created By xiaoweiping 2019/6/10 17:48
 **/
//@Component
    //可以代替Component注解，本质和它没有区别，语义上更明确了，明确的表示是Controller
@Controller
public class UserController {

    @Autowired
    @Qualifier("userServiceNormal")
    private UserService userService;

    public void  add(){
        userService.add();
    }


}

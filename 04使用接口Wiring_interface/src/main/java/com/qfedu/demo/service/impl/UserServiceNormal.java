package com.qfedu.demo.service.impl;

import com.qfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created By xiaoweiping 2019/5/31 14:53
 **/
@Component
@Qualifier("normal")
public class UserServiceNormal implements UserService {

    @Override
    public void add() {
        System.out.println("添加用户");
    }
}

package com.qfedu.demo.service.impl;

import com.qfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created By xiaoweiping 2019/5/31 14:59
 **/
@Component
//这个类所创建出来的对象就是首选bean
//@Primary

//使用限定符
@Qualifier("festival")
public class UserServiceFestival  implements UserService {

    @Override
    public void add() {
        System.out.println("注册用户并发送优惠券");
    }
}

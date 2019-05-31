package com.qfedu.demo.service.impl;

import com.qfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created By xiaoweiping 2019/5/31 14:59
 **/
//不填写也会默认生成一个首写字母小写的类id，例如：userServiceFestival
@Component
//这个类所创建出来的对象就是首选bean
//@Primary

//使用限定符
//@Qualifier("festival")

//为当前的UserServiceFastival声明类id   不填写也会默认生成一个首写字母小写的类id，例如：userServiceFestival
//@Component("fastival")
public class UserServiceFestival  implements UserService {

    @Override
    public void add() {
        System.out.println("注册用户并发送优惠券");
    }
}

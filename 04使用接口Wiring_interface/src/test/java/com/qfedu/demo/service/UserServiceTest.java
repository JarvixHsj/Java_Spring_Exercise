package com.qfedu.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created By xiaoweiping 2019/5/31 14:55
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {

    @Autowired
    //会去寻找名字相同的类id或者Qualifier定义相同的名称
//    @Qualifier("fastival")

    @Qualifier("userServiceNormal")
    private UserService userService;

    @Test
    public void testAdd() {
        userService.add();
    }
}

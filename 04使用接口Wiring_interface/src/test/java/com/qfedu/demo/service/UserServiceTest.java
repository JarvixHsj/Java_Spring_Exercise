package com.qfedu.demo.service;

import com.qfedu.demo.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created By xiaoweiping 2019/5/31 14:55
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {

//    @Autowired
    //会去寻找名字相同的类id或者Qualifier定义相同的名称
//    @Qualifier("fastival")

//    @Qualifier("userServiceNormal")
    /**
     * 这个注解代替了@AutoWired 和 @Qualifier两个注解，但这个不是Spring的标准（看引入的包，是javax），是jdk的标准
     * name就是类id（定义的或者默认的都可以）
     */
    @Resource(name="userServiceNormal")
    private UserService userService;

    @Test
    public void testAdd() {
        userService.add();
    }
}

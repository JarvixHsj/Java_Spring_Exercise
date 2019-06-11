package com.qfedu.demo.config;

import com.qfedu.demo.dao.UserDao;
import com.qfedu.demo.dao.impl.UserDaoCache;
import com.qfedu.demo.dao.impl.UserDaoNormal;
import com.qfedu.demo.service.UserService;
import com.qfedu.demo.service.impl.UserServiceNormal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created By xiaoweiping 2019/6/11 16:02
 **/
@Configuration
public class AppConfig {

    //配置Bean对象
    @Bean
//    @Primary
    @Qualifier("normal")
    public UserDao userDaoNormal(){
        System.out.println("创建userDaoNormal对象");
        return new UserDaoNormal();
    }

    //配置Bean对象
    @Bean
    @Qualifier("cache")
    public UserDao userDaoCache(){
        System.out.println("创建userDaoCache对象");
        return new UserDaoCache();
    }

    // 会在spring启动的时候自动调用，因为有@Bean注解，并且将UserService具体的UserSericeNormal对象创建出来
    @Bean
    public UserService userServiceNormal(@Qualifier("cache") UserDao userDao){
     /*   //在UserServiceNormal里面增加无参和有参方法，把上面创建的UserDao对象做一个关联
        //另外一个点，这里的userDaoNormal方法是指向的上面的方法，在实际运行过程中并不会被调用两次，
        // 会检测上下文是否有UserDaoNormal对象，如果有则不会在调用userDaoNormal方法，会直接返回userDaonormal对象
        //既然这样就不需要这行代码了，直接在方法里面写userDaoNormal
//        UserDao userDao = userDaoNormal();*/

//        System.out.println("创建UserService对象");
//        return new UserServiceNormal(userDao);


        /*  另外一种 setter 方式来实现依赖注入 */
        System.out.println("创建UserService对象");
        UserServiceNormal userService = new UserServiceNormal();
        userService.setUserDao(userDao);
        return userService;
    }



}

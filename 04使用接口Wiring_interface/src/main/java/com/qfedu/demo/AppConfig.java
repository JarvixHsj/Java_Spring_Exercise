package com.qfedu.demo;

import com.qfedu.demo.dao.UserDao;
import com.qfedu.demo.service.UserService;
import com.qfedu.demo.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created By xiaoweiping 2019/5/31 14:54
 **/
@Configuration
//扫描组件的注解，会扫描当前文件位置，父目录下的所有组件，也可以添加参数指定扫描包
//@ComponentScan("com.qfedu.demo")

//basePackages，可以指定扫描多个包
//@ComponentScan(basePackages = {"com.qfedu.demo.web","com.qfedu.demo.service"})

//设定扫描指定多个文件
@ComponentScan(basePackageClasses = {UserController.class, UserService.class,UserDao.class})
public class AppConfig {

}

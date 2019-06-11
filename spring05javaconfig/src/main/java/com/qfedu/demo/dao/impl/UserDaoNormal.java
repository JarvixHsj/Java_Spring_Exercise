package com.qfedu.demo.dao.impl;

import com.qfedu.demo.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created By xiaoweiping 2019/6/11 16:01
 **/
@Repository
public class UserDaoNormal implements UserDao {

    @Override
    public void add() {
        System.out.println("添加用户到数据库中……");
    }
}

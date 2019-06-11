package com.qfedu.demo.dao.impl;

import com.qfedu.demo.dao.UserDao;

/**
 * Created By xiaoweiping 2019/6/11 17:26
 **/
public class UserDaoCache implements UserDao {
    @Override
    public void add() {
        System.out.println("添加用户到缓存中……");
    }
}

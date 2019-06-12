package com.qfedu.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created By xiaoweiping 2019/6/12 17:44
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class NotepadTestAutowrite {

    @Autowired
    private Notepad notepad1;

    @Autowired
    private Notepad notepad2;

/*
* 无论注入多少次，拿到的都是同一个对象
* */
    @Test
    public void test01(){
        System.out.println(notepad1 == notepad2);
    }
}

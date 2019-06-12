package com.qfedu.demo.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created By xiaoweiping 2019/6/12 14:32
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CDPlayerTest {

    @Autowired
    private CDPlayer cdPlayer1;

    @Autowired
    private CDPlayer cdPlayer2;


    @Test
    public void Test01(){
        cdPlayer1.play();
    }

    @Test
    public void Test02(){
        cdPlayer2.play();
    }
}

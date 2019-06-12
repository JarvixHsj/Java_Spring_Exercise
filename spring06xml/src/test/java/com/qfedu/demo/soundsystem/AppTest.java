package com.qfedu.demo.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created By xiaoweiping 2019/6/12 11:56
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {

    @Autowired
    private  CompactDisc compactDisc1;

    @Autowired
    private  CompactDisc compactDisc2;

    @Autowired
    @Qualifier("compactDisc2")
    private  CompactDisc compactDisc3;

    @Test
    public void test01(){
        compactDisc1.play();
        compactDisc2.play();
        compactDisc3.play();

    }
}

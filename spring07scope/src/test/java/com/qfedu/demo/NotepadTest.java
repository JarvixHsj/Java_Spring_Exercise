package com.qfedu.demo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By xiaoweiping 2019/6/12 17:38
 **/
public class NotepadTest {

    /*
    * 1.无论我们是否去主动获取bean对象，Spring上下文一加载就会创建bean对象
    * 2.无论获取多少次，拿到的都是同一个对象
    * 3.无论注入多少次，拿到的都是同一个对象
    * */
    @Test
    public void test01(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Notepad notepad1 = (Notepad) context.getBean("notepad");
        Notepad notepad2 = (Notepad) context.getBean("notepad");
        System.out.println(notepad1 == notepad2);
    }
}

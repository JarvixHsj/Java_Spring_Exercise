package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created By xiaoweiping 2019/5/31 12:00
 **/
//自动初始化上下文环境
@RunWith(SpringJUnit4ClassRunner.class)
//读取配置文件，下面定义content的内容就不需要了
@ContextConfiguration(classes = AppConfig.class)
public class AppTest {

    //因为头部有了RunWith，初始化了上下文环境，所以可以配置自动注入，下面的getBean就不需要了
    @Autowired
    private CDPlayer player;

    /**
     * 如果我们之后都是用这个文件来做测试，那么main目录下的soundsystem里的Application则可以删除了
     */
    @Test
    public void testPlayer(){

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
    }
}

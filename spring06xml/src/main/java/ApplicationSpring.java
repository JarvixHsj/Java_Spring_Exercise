import com.qfedu.demo.soundsystem.CompactDisc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By xiaoweiping 2019/6/12 11:29
 **/
public class ApplicationSpring {

    public static void main(String[] args) {
        System.out.println("ApplicationSpring is runing……");

        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
//        CompactDisc cd = context.getBean(CompactDisc.class);
        CompactDisc cd = (CompactDisc) context.getBean("compactDisc2");
        cd.play();
    }
}

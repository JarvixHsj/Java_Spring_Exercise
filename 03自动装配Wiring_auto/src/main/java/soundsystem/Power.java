package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created By xiaoweiping 2019/5/31 14:13
 **/
@Component
public class Power {
    public Power() {
        super();
    }

    public void supply(){
        System.out.println("电源供电中……");
    }
}

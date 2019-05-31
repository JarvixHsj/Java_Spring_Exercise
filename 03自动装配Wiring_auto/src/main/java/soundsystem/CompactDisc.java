package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created By xiaoweiping 2019/5/31 11:06
 **/
//@Component
public class CompactDisc {

    /**
     * 创建无参构造方法，Intellij Idea 快捷键 ctrl+o
     */
    public CompactDisc() {
        super();
        System.out.println("CompactDisc 无参构造方法函数");
    }

    public void  play(){
        System.out.println("正在播放音乐");
    }
}

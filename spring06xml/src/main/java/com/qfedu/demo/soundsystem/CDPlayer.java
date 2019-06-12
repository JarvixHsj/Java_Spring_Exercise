package com.qfedu.demo.soundsystem;

/**
 * Created By xiaoweiping 2019/6/12 14:29
 **/
public class CDPlayer {

    private CompactDisc cd;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer无参构造方法……" + this.toString());
    }

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
        System.out.println("CDPlayer有参构造函数"+ this.toString());
    }

    public void play(){
        cd.play();
    }
}

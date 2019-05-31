package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created By xiaoweiping 2019/5/31 11:08
 **/
@Component
public class CDPlayer {
    @Autowired(required = false)
    private CompactDisc cd;

    @Autowired
    private Power power;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer无参构造函数");
    }

/*    @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
        System.out.println("调用SetCd……");
    }

    @Autowired
    public void setPower(Power power) {
        this.power = power;
        System.out.println("调用SetPower……");
    }*/

/*
    @Autowired
    public CDPlayer(CompactDisc cd, Power power) {
        this.cd = cd;
        this.power = power;
        System.out.println("CDPlayer的多参数构造函数");
    }

    *//**
     * 创建有参构造函数
     * alt + Insert 选择constructor
     * @param cd
     *//*
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
        System.out.println("CDPlayer的有参构造函数");
    }*/

/*    @Autowired
    public void prepare(CompactDisc cd, Power power){
        this.cd = cd;
        this.power = power;
        System.out.println("Prepare方法被调用……");
    }*/

    public void play(){
        power.supply();
        if (cd != null) {
            cd.play();
        }
    }
}

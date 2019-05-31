package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//扫描标有Component的类
@ComponentScan
public class ApplicationSpring {
    public static void main(String[] args) {

        System.out.println("ApplicationSpring");
//        //创建打印机对象
//        MessagePrinter printer = new MessagePrinter();
//        //创建消息服务对象
//        MessageService service = new MessageService();
          //设置打印机对象给server属性
//        printer.setService(service);
//        printer.printMessage();

        //初始化Spring容器，创建标有Component的类对象
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);
        //从容器中获取Component对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);
//        MessageService service = context.getBean(MessageService.class);

//        System.out.println(printer);
//        System.out.println(service);

        //设置打印机对象给server属性`
//        printer.setService(service);
        printer.printMessage();
    }
}

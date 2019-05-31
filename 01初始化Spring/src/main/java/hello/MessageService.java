package hello;

import org.springframework.stereotype.Component;

/**
 * 打印服务
 */
@Component
public class MessageService {

    /**
     * 无参构造方法
     */
    public MessageService() {
        super();
        System.out.println("MessageServices…………");
    }

    public String printMessage() {
        return "Hello World!";
    }
}

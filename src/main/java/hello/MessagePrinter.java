package hello;

import org.springframework.stereotype.Component;

/**
 * 打印机
 */
@Component
public class MessagePrinter {

    private MessageService service;

    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter……");
    }

    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.printMessage());
    }
}

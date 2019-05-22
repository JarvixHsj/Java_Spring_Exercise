package hello;

/**
 * 打印机
 */
public class MessagePrinter {

    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.printMessage());
    }
}

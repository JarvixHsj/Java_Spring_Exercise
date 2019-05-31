package hello;

public class Application {
    public static void main(String[] args) {

        System.out.println("Application");
        //创建打印机对象
        MessagePrinter printer = new MessagePrinter();
        //创建消息服务对象
        MessageService service = new MessageService();

        printer.setService(service);
        printer.printMessage();
    }
}

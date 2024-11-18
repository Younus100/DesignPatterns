package DecoratorDesign_Notification;

public class SMSNotification extends Notification{
    public SMSNotification(String msg) {
        super(msg);
    }
    @Override
    public void notifyy() {
        System.out.println("SMS Send" + msg);
    }
}

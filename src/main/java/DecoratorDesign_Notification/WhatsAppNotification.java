package DecoratorDesign_Notification;

public class WhatsAppNotification extends NotificationDecorator{

    public WhatsAppNotification(Notification notification) {
        super(notification);
    }

    @Override
    void notifyy() {
        System.out.println("Whatsapp notoficatoon send "+ msg);
        notification.notifyy();
    }

}

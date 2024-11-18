package DecoratorDesign_Notification;

public class TwitterNotification extends NotificationDecorator{

    public TwitterNotification(Notification notification) {
        super(notification);
    }

    @Override
    void notifyy() {
        System.out.println("Twitter notoficatoon send "+ super.msg);
        notification.notifyy();
    }
}

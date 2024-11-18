package DecoratorDesign_Notification;

public abstract class NotificationDecorator extends Notification {
    protected Notification notification; // Composition for decoration

    public NotificationDecorator(Notification notification) {
        super(notification.msg); // Pass the message from the wrapped notification
        this.notification = notification; // Store the wrapped notification
    }

    @Override
    abstract void notifyy(); // Keep it abstract here
}
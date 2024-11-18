package DecoratorDesign_Notification;

public abstract class Notification {
    String msg;
    public Notification(String msg) {
        this.msg = msg;
    }
     abstract void notifyy();
}

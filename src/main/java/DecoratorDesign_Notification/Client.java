package DecoratorDesign_Notification;

public class Client {
    public  static void main(String args[]){
        Notification notification = new SMSNotification("20% offer");
        WhatsAppNotification whatsAppNotification = new WhatsAppNotification(notification);
        TwitterNotification twitterNotification = new TwitterNotification(whatsAppNotification);
        twitterNotification.notifyy(); //make this subscribe
    }

}

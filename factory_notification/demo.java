public class demo{
  public static void main(String[] args) {
      NotificationCreator creator=new SMSNotificationCreator();
      creator.send();
      creator=new EmailNotificationCreator();
      creator.send();

  }
}
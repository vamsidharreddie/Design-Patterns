abstract class NotificationCreator{
  Notification notification;
public abstract Notification CreateNotification();
  void send(){
    Notification notification=CreateNotification();
    notification.send();
  }
}
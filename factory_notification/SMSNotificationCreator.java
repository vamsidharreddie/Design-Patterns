class SMSNotificationCreator extends NotificationCreator{
  public Notification CreateNotification(){
    return new SMSNotification();
  }
}
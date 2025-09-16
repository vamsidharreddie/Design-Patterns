class EmailNotificationCreator extends NotificationCreator{
  public Notification CreateNotification(){
    return new EmailNotification();
  }
}
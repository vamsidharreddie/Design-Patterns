public class demo{
  public static void main(String[] args) {
    Subscriber s1=new MobileSubscriber("raj");
    Subscriber s2=new WebSubscriber("Kamal");
    Subscriber s3=new EmailSubscriber("Rajni");
      YoutubeChannel youtubeChannel=new YoutubeChannel();
      youtubeChannel.subscribe(s1);
      youtubeChannel.subscribe(s2);
      youtubeChannel.subscribe(s3);
      youtubeChannel.uploadVid("1st video");
  }
}


public class demo{
  public static void main(String[] args) {
      VideoDownloader downloader=new CachedDownloader();
      downloader.download("abc");
      downloader.download("xyz");
      downloader.download("abc");
  }
}
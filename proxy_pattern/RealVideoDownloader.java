class RealVideoDownloader implements VideoDownloader{
  @Override
  public void download(String video){
    System.out.println("Video downloading from real downloader "+video);
  }
}
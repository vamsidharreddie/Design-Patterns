class WebPlayer extends VideoPlayer{
public WebPlayer(VideoQuality quality){
  super(quality);
  }
@Override
public void play(){
  System.out.println("Web player");
  quality.load();
}

}
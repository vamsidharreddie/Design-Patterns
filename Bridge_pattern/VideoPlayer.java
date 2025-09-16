abstract class VideoPlayer{
  VideoQuality quality;
public VideoPlayer(VideoQuality quality){
this.quality=quality;
}
abstract void play();
}
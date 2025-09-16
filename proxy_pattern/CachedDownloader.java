
import java.util.HashSet;
import java.util.Set;

class CachedDownloader implements VideoDownloader{
  Set<String>st;
  RealVideoDownloader realVideoDownloader;
    public CachedDownloader() {
st=new HashSet<>();
realVideoDownloader=new RealVideoDownloader();
    }
  @Override
  public void download(String video){
    if(st.contains(video)){
    System.out.println("Video downloading from cache " +video);
    return;
    }
    realVideoDownloader.download(video);
    st.add(video);
  }
}
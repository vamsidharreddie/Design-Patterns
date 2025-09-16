
import java.util.ArrayList;
import java.util.List;

class YoutubeChannel implements Channel{
  List<Subscriber>subscribers;
  public YoutubeChannel(){
    subscribers=new ArrayList<>();
  }
@Override
public void notifyAll(String str){

for(Subscriber subscriber:subscribers){
  subscriber.update(str);
}
}
@Override
public void subscribe(Subscriber name){
  subscribers.add(name);
}
@Override
public void unsubscribe(Subscriber name){
  subscribers.remove(name);
}
void uploadVid(String str){
  notifyAll(str);
}
}
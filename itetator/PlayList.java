
import java.util.ArrayList;
import java.util.List;

class PlayList implements IterableCollection<String>{
  List<String>songs;
  public PlayList(){
    songs=new ArrayList<>();
  }
  void add(String song){
    songs.add(song);
  }
  int size(){
    return songs.size();
  }
  String get(int index){
  return songs.get(index);
  }
  @Override
  public Iterator<String>createIterator(){
    return new PlayListIterator(this);
  }
}
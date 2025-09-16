class PlayListIterator implements Iterator<String>{
  PlayList playList;
  int index;
  public PlayListIterator(PlayList pl){
    this.playList=pl;
    index=0;
  }
  @Override
  public boolean hasNext(){
  return index<playList.size();
  }
  @Override
  public String next(){
    return playList.get(index++);
  }
}
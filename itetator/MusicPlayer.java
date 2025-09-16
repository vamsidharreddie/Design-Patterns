

public class MusicPlayer{

  public static void main(String[] args) {
      PlayList playList=new PlayList();
      playList.add("orange");
      playList.add("Bahubali");
      playList.add("awaara");
      Iterator<String> it=playList.createIterator();
      System.err.println(it.hasNext());
      System.out.println(it.next());
      System.out.println(it.next());

  }
}
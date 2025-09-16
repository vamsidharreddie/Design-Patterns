
import java.util.ArrayList;
import java.util.List;

public class demo{
  public static void main(String[] args) {
    List<item>ls;
      ls = new ArrayList<>();
      bundle lot=new bundle();
      eraser e=new eraser();
      book b=new book();
      pen p=new pen();
      lot.additem(e);
      lot.additem(p);
      ls.add(lot);
      ls.add(b);
      ls.add(p);
    int sum=0;
    for(int i=0;i<ls.size();i++)sum+=ls.get(i).getCost();
    System.out.println("total cost is  " + sum);

  }
}
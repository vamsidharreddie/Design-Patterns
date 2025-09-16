
import java.util.ArrayList;
import java.util.List;

class bundle implements item{
  List<item>list;
  public bundle(){
    list=new ArrayList<>();
  }
  public void additem(item x){
    list.add(x);
  }
  @Override
  public int getCost(){
    int sum=0;
    for(int i=0;i<list.size();i++){
      sum+=list.get(i).getCost();
    }
    return sum;
  }
}
public class demo{
  public static void main(String[] args) {
       Forest forest =new Forest();
  for(int i=0;i<100;i++){
    forest.plantTree(i,i,"Oak","Green","tall");
  }
  forest.draw();
  }
 
}
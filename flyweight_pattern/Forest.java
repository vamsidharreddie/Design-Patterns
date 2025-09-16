
import java.util.ArrayList;
import java.util.List;
class Forest{
  private List<Tree>trees=new ArrayList<>();
  public void plantTree(int x,int y,String name,String color,String height){
   Tree tree=new Tree(x,y,TreeFactory.getTreeType(name,color,height));
    trees.add(tree);
  }
  public void draw(){
    for(Tree tree:trees){
      tree.draw();
    }
  }
}
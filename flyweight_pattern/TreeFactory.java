import java.util.HashMap;
import java.util.Map;
class TreeFactory{
    static  Map<String,TreeType>mpp=new HashMap<>();
     public static TreeType getTreeType(String name,String color,String height){
      String key=name+"-"+color+"-"+height;
      if(!mpp.containsKey(key)){
        mpp.put(key,new TreeType(name,color,height));
      }
      return mpp.get(key);
     }
      
}
class StaticBlockSingleton{
  private static StaticBlockSingleton instance;
  private StaticBlockSingleton(){} 
  static{
    try {
       instance=new StaticBlockSingleton(); 
    } 
    catch (Exception e) {
      throw new RuntimeException("Exception occured during intitnalization");
    }
  }
  public static StaticBlockSingleton getInstance(){
    return instance;
  }
}
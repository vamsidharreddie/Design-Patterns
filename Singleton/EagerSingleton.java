class EagerSingleton{
  private  static final EagerSingleton INSTANCE=new EagerSingleton();
  private EagerSingleton(){System.out.println("EagerLoadingSingleton is initialised");}
  public static EagerSingleton getInstance(){
    return INSTANCE;
  }
}
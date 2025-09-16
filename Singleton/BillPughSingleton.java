
class BillPughSingleton{
  private BillPughSingleton(){}
  private static class SingletonHelper{
    private static BillPughSingleton instance=new BillPughSingleton();
  }
  public static BillPughSingleton getInstance(){
    return SingletonHelper.instance;
  }
}
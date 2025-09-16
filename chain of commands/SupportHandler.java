abstract class SupportHandler{
  SupportHandler nextHandler;
  void setnext(SupportHandler nextHandler){
    this.nextHandler=nextHandler;
  }
  public abstract void handleRequest(String request);
}
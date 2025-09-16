public class demo{
  public static void main(String[] args) {
      OrderContext context=new OrderContext();
      context.next();
      context.getState();
      context.next();
      context.getState();
      context.next();
      context.cancel();

      context.next();
      

  }
}
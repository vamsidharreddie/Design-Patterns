public class demo{
  public static void main(String[] args) {
      PaymentContext context=new PaymentContext();
      context.setStrategy(new UPI("123@ibl"));
      context.make_payment(100);
  }
}
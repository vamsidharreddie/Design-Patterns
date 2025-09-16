class Razorpay implements PaymentGateway{
  @Override
  public void pay(String id,double amount){
    System.out.println("Razor pay : Amount paid is "+amount+" Id is "+id);
  }
}
class Paypal implements PaymentGateway{
  @Override
  public void pay(String id,double amount){
    System.out.println("Paypal:Amount paid is "+amount+" Id is "+id);
  }
}
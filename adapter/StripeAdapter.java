class StripeAdapter implements PaymentGateway{
  Stripe stripe=new Stripe();
  @Override
public void pay(String id,double amount){
stripe.make_payment(id, amount);
}
}
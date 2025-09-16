public class demo{
public static void main(String[] args) {
    PaymentGateway paypal=new Paypal();
    paypal.pay("1234",100.0);
    PaymentGateway razorpay=new Razorpay();
    razorpay.pay("234",200);
    PaymentGateway stripe=new StripeAdapter();
    stripe.pay("345",345);
}
}
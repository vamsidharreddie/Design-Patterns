class PaymentContext{
 Strategy s;
  void setStrategy(Strategy s){
this.s=s;
  }
  void make_payment(int amount){
    s.pay(amount);
  }
}
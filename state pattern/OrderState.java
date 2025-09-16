interface  OrderState{
  void next(OrderContext context);
  void cancel();
  void getState();
}
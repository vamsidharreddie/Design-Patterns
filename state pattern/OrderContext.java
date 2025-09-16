class OrderContext{
  OrderState state;

    public OrderContext() {
      state=new OrderPlacedState();
    }
    void set(OrderState nextstate){
      state=nextstate;
    }
    public void next(){
      state.next(this);
    }
    public void cancel(){
      state.cancel();
    }
    public void getState(){
      state.getState();
    }
  
}
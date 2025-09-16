class OrderPlacedState implements OrderState{
@Override
public void next(OrderContext context){
  context.set(new PreparingOrderState());
}
@Override
public void getState(){
System.out.println("Order Placed");
}
@Override
public void cancel(){
  System.out.println("Cancelling the order");
}
}
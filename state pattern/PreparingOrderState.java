class PreparingOrderState implements OrderState{
@Override
public void next(OrderContext context){
  context.set(new OutForDeliveryState());
}
@Override
public void getState(){
System.out.println("preparing order");
}
@Override
public void cancel(){
  System.out.println("Cancelling the order");
}
}
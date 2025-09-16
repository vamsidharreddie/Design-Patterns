class OutForDeliveryState implements OrderState{
@Override
public void next(OrderContext context){
  context.set(new DeliveredState());
}
@Override
public void getState(){
System.out.println("Order out for delivery");
}
@Override
public void cancel(){
  System.out.println("Cancelling is not possible ");
}
}
class DeliveredState implements OrderState{
@Override
public void next(OrderContext context){
  System.out.println("Order is already delivered");
}
@Override
public void getState(){
System.out.println("Order delivered");
}
@Override
public void cancel(){
  System.out.println("Cancelling the order is not possible");
}
}
class DeliverySupport extends SupportHandler{
@Override
public void handleRequest(String request){
  if(request.equals("delivery")){
    System.out.println("Delivery request is handled ");
  }
  else if(nextHandler!=null){
    nextHandler.handleRequest(request);
  }
}
}
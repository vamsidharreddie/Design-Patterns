class BillingSupport extends SupportHandler{
@Override
public void handleRequest(String request){
  if(request.equals("bill")){
    System.out.println("Bill request is handled ");
  }
  else if(nextHandler!=null){
    nextHandler.handleRequest(request);
  }
}
}
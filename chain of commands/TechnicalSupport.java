class TechnicalSupport extends SupportHandler{
@Override
public void handleRequest(String request){
  if(request.equals("technical")){
    System.out.println("Technical request is handled ");
  }
  else if(nextHandler!=null){
    nextHandler.handleRequest(request);
  }
}
}
class GeneralSupport extends SupportHandler{
@Override
public void handleRequest(String request){
  if(request.equals("general")){
    System.out.println("general request is handled ");
  }
  else if(nextHandler!=null){
    nextHandler.handleRequest(request);
  }
}
}
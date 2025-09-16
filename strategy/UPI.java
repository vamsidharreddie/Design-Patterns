class UPI implements Strategy{
String upi_id;
public UPI(String id){
  upi_id=id;
}
@Override
public void pay(int amount){
  System.out.println("paying via upi : "+"amount :"+amount+" upi id : "+upi_id );
}
}
class CreditCard implements Strategy{
String cardNo;
public CreditCard(String id){
  cardNo=id;
}
@Override
public void pay(int amount){
  System.out.println("paying via Credit Card : "+"amount :"+amount+" card no : "+cardNo );
}
}
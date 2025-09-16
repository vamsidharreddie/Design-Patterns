

class EmailSubscriber implements Subscriber{
 String name;
public EmailSubscriber(String  s){
  this.name=s;
}
 @Override
public void update(String str){
System.out.println("notifed to "+name+" about video  : " +str);
}
}
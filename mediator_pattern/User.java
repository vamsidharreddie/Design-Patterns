abstract class User{
Mediator mediator;
String name;
public User(String name,Mediator mediator){
  this.name=name;
  this.mediator=mediator;
}
void send(String msg){
  mediator.sendMessage(msg, this);
}
void recieve(String msg){
  System.out.println( name+" :"+msg);
}
}
public class demo{
  public static void main(String[] args) {
  ChatRoom mediator=new ChatRoom();
 User user1=new RealUser("ramu",mediator);
 User user2=new RealUser("remo",mediator);
 User user3=new RealUser("aparichithudu",mediator);
 mediator.addUser(user1);
 mediator.addUser(user2);
 mediator.addUser(user3);
 user3.send("Hello Folks");
  }
}
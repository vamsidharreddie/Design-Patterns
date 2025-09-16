
import java.util.ArrayList;
import java.util.List;

class ChatRoom implements Mediator{
  List<User>ls;
  public ChatRoom(){
    ls=new ArrayList();
  }
  public void addUser(User user){
    ls.add(user);
  }
  public void sendMessage(String msg,User x){
    for(User user:ls){
      if(user!=x)user.recieve(msg);
    }
  }
}
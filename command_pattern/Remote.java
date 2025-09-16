
import java.util.Stack;
class Remote{
  Command []slot=new Command[4];
  Stack<Command>st=new Stack<>();
  void SetSlot(int index,Command cmd){
     slot[index]=cmd;
  }
  void action(int x){
    slot[x].execute();
    st.push(slot[x]);
  }
void undo(){
  Command temp=st.pop();
  temp.undo();
}
}
class AcOnCommand implements Command{
  AC ac;
 public  AcOnCommand(AC ac){
  this.ac=ac;
 }
 public void execute(){
  ac.on();
 }
 public void undo(){
  ac.off();
 }
}
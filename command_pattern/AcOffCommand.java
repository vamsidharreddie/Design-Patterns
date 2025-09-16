class AcOffCommand implements Command{
  AC ac;
 public  AcOffCommand(AC ac){
  this.ac=ac;
 }
 public void execute(){
  ac.off();
 }
 public void undo(){
  ac.on();
 }
}
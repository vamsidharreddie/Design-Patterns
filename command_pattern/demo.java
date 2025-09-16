public class demo{
  public static void main(String[] args) {
      Light light=new Light();
      AC ac=new AC();
      Remote remote=new Remote();
      LightOnCommand lightOn=new LightOnCommand(light);
      LightOffCommand lightOff=new LightOffCommand(light);
      AcOnCommand AcOn=new AcOnCommand(ac);
      AcOffCommand AcOff=new AcOffCommand(ac);

      remote.SetSlot(0,lightOn);
      remote.SetSlot(1,lightOff);
      remote.SetSlot(2,AcOn);
      remote.SetSlot(3,AcOff);
      remote.action(0);
      remote.action(2);
      remote.undo();
      remote.undo();

      
  }
}
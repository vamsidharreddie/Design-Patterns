class MACOSFactory implements GUIFactory{
  @Override
  public button createbutton(){
    return new MACOSbutton();
  }
  @Override
  public checkbox createcheckbox(){
      return new MACOScheckbox();
  }
}
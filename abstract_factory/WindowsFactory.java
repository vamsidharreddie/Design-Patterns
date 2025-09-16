class WindowsFactory implements GUIFactory{
  @Override
  public button createbutton(){
       return new WindowsButton();
  }
  @Override
  public checkbox createcheckbox(){
    return new WindowsCheckbox();
  }
}
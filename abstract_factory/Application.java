class Application{
  button button1;
  checkbox checkbox1;
  Application(GUIFactory factory){
    this.button1=factory.createbutton();
    this.checkbox1=factory.createcheckbox();
  }
  public void renderUI(){
    button1.paint();
    checkbox1.paint();
  }
}
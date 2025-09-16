

public class demo{
  public static void main(String[] args) {
    GUIFactory factory=new WindowsFactory();
      Application app=new Application(factory);
      app.renderUI();

  }
}
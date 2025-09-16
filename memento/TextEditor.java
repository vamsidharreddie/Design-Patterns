public class TextEditor{
  private String content="";
  public void type(String content){
    this.content+=content;
  }
  public String getContent(){
    return content;
  }
  public TextEditorMemento save(){
    System.out.println("saving state : "+content);
    return new TextEditorMemento(content);
  }
public void restore(TextEditorMemento memento){
  content= memento.getState();
  System.out.println("restoring state to "+content);
}
}


public class demo{
  public static void main(String[] args) {
      TextEditor editor=new TextEditor();
      TextEditorUndoManager undoManager=new TextEditorUndoManager();
      editor.type("hello ");
      undoManager.save(editor);
      editor.type("world");
      undoManager.save(editor);
      undoManager.undo(editor);
      undoManager.undo(editor);
      undoManager.undo(editor);
      undoManager.undo(editor);
    

  }
}
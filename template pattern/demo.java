public class demo{
  public static void main(String[] args) {
       DataProcessor processor=new jsonProcessor();
       processor.openFile();
       processor.processFile();
       processor.closeFile();
  }
}
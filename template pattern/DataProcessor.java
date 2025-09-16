abstract class DataProcessor{
void openFile(){
  System.out.println("opening the file");
}
abstract void processFile();
void closeFile(){
  System.err.println("Closing the file");
}
}
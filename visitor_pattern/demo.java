public class demo{
  public static void main(String[] args) {
      Circle circle =new Circle(5);
      Rectangle rect=new Rectangle(2,4);
      Visitor visitor =new Area();
      circle.accept(visitor);
      rect.accept(visitor);
      }
  
}
class Area implements Visitor{
  @Override
  public void visitCircle(Circle circle){
System.out.println("Area of circle is "+3.14*circle.radius);
  }
  @Override 
  public void visitRectangle(Rectangle rect){
System.out.println("Area of rectangle is "+rect.length*rect.width);
  }
}

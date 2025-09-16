class Circle implements Shape{
  public int radius;
  public Circle(int x){
    radius=x;
  }

  @Override
  public void accept(Visitor visitor){
    visitor.visitCircle(this);
  }
}
class Rectangle implements Shape{
  public int width;
  public int length;
  public Rectangle(int x,int y){
      width=y;
      length=x;
  }
  void setLength(int x){
    length=x;
  }
  void setWidth(int x){
    width=x;
  }
  @Override
  public void accept(Visitor visitor){
    visitor.visitRectangle(this);
  }
}
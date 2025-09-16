class TreeType{
  String name;
  String color;
  String height;
  public TreeType(String name,String color,String height){
    this.name=name;
    this.color=color;
    this.height=height;
  }
  void draw(int x,int y){
    System.out.println("Drawing "+name+" tree at ("+x+","+y+")");
  }
}
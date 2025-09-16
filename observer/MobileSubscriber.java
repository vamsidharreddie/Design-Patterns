class MobileSubscriber implements Subscriber{
  String name;
  public MobileSubscriber(String s){
  this.name=s;
}
@Override
public void update(String str){

System.out.println("notifed to "+name+" about video  : " +str);

}
}
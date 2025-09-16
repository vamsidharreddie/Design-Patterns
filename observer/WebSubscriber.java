class WebSubscriber implements Subscriber{
  String name;
    public WebSubscriber(String s) {
      this.name=s;
    }
@Override
public void update(String str){
System.out.println("notifed to "+name+" about video  : " +str);

}
}
public class demo{
  public static void main(String[] args) {
      HTTPRequest request=new HTTPRequest.Builder("www.google.com")
      .setmethod("get").
      setbody("hello world")
      .settimeout(30)
      .build();
request.getbody();
request.getmethod();

  }
}
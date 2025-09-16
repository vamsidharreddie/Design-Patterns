class HTTPRequest{
  private String url;
  private String method;
  private int timeout;
  private String body;
  private HTTPRequest(Builder builder){
   this.url=builder.url;
   this.method=builder.method;
   this.timeout=builder.timeout;
   this.body=builder.body;
  }
  void getbody(){
    System.out.println(body);
  }
  void getmethod(){
    System.out.println(method);
  }
  public static class Builder {
 private String url;
  private String method;
  private int timeout;
  private String body;
  public Builder(String url){
    this.url=url;
  }
  Builder setmethod(String method){
    this.method=method;
    return this;
  }
  Builder settimeout(int timeout){
    this.timeout=timeout;
    return this;
  }
  Builder setbody(String body){
    this.body=body;
    return this;
  }
  HTTPRequest build(){
    return new HTTPRequest(this); 
  }
  }
}
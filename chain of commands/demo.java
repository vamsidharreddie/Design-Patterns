public class demo{
  public static void main(String[] args) {
      SupportHandler general=new GeneralSupport();
      SupportHandler bill=new BillingSupport();
      SupportHandler technical=new TechnicalSupport();
      SupportHandler delivery=new DeliverySupport();
      general.setnext(technical);
      technical.setnext(bill);
      bill.setnext(delivery);
      general.handleRequest("bill");
  }
}
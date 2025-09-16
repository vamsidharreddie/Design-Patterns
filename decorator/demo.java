public class demo{
  public static void main(String[] args) {
      Pizza pizza=new MargheritaPizza();
      pizza=new ExtraCheese(pizza);
      pizza=new Olive(pizza);
      System.out.println(pizza.getDescription());
      System.out.println(pizza.getCost());


  }
}
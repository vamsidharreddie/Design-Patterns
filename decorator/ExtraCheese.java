class ExtraCheese extends PizzaDecorator{
  public ExtraCheese(Pizza pizza){
       super(pizza);
  }
  @Override
  public String getDescription(){
return pizza.getDescription()+"extra cheese";
  }
  @Override
  public double getCost(){
return pizza.getCost()+50;
  }
}
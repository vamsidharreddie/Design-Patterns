class Crust extends PizzaDecorator{
  public Crust(Pizza pizza){
       super(pizza);
  }
  @Override
  public String getDescription(){
return pizza.getDescription()+"crust ";
  }
  @Override
  public double getCost(){
return pizza.getCost()+50;
  }
}
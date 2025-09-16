class Olive extends PizzaDecorator{
  public Olive(Pizza pizza){
       super(pizza);
  }
  @Override
  public String getDescription(){
return pizza.getDescription()+"olive ";
  }
  @Override
  public double getCost(){
return pizza.getCost()+50;
  }
}
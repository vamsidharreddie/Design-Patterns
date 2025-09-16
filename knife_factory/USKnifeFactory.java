class USKnifeFactory implements KnifeFactory{
  @Override
  public  Knife CreateKnife(String type){
    if(type.equals("chef"))return new USChefKnife();
    else if(type.equals("plastic"))return new USPlasticKnife();
    else  throw new IllegalArgumentException("Unknown knife type: " + type);
  }
}
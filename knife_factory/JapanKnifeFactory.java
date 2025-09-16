class JapanKnifeFactory implements KnifeFactory{
  @Override
   public  Knife CreateKnife(String type){
    if(type.equals("plastic"))return new JapanPlasticKnife();
    else if(type.equals("chef"))return new JapanChefKnife();

   else  throw new IllegalArgumentException("Unknown knife type: " + type);
  }
}
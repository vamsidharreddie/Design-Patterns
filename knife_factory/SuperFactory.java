public class SuperFactory{
  KnifeFactory factory;
 Knife CreateKnife(String type,String Country){
  if(Country.equals("US"))factory=new USKnifeFactory();
  else if(Country.equals("Japan"))factory=new JapanKnifeFactory();
  else throw new IllegalArgumentException("unknown country"+Country);
  return factory.CreateKnife(type);
}
}
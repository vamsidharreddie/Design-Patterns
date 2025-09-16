public class KnifeStore{
SuperFactory factory=new SuperFactory();
public void buy(String type, String Country){
Knife knife=factory.CreateKnife(type,Country);
knife.manufacture();}
} 
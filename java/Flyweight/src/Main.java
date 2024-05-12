import java.util.ArrayList;
import java.util.List;

import flyweight.BoxFactory;
import flyweight.BoxFlyweight;

public class Main {
	
	public static void main(String[] args) {
		//List<BoxFlyweight> caixas = new ArrayList<>();
		
		BoxFlyweight bfAmazon = BoxFactory.getFlyweight("Amazon", 6);
		
		BoxFlyweight bfML = BoxFactory.getFlyweight("Mercado Livre", 6);
		
		BoxStorage bs1 = new BoxStorage(50, 10, "papelão", bfAmazon);
		
		bs1.printStorage();
		
		BoxStorage bs2 = new BoxStorage(10, 18, "papelão", bfML);
		
		bs2.printStorage();
		
		BoxStorage bs3 = new BoxStorage(5, 15, "papelão", bfAmazon);
		
		bs3.printStorage();
		
		
		
	}
	
}

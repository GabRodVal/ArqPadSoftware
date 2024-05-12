import java.util.ArrayList;
import java.util.List;

import flyweight.Box;
import flyweight.BoxFactory;
import flyweight.BoxFlyweight;

public class BoxStorage {
	
	private List<Box> caixas = new ArrayList<>();
	
	public BoxStorage(int numCaixas, int size, String material, BoxFlyweight bf) {
		
		//BoxFlyweight bf = BoxFactory.getFlyweight("Amazon", 6);
		
		for(int f = 0; f<numCaixas;f++) {
			Box caixa =  new Box(size, f, material, bf);
			caixas.add(caixa);
		}
	}
	
	public void printStorage() {
		for(int f = 0; f<caixas.size(); f++) {
			caixas.get(f).printBox();
		}
	}

}

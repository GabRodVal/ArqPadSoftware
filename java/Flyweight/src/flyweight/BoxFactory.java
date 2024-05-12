package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BoxFactory {
	private static Map<String, BoxFlyweight> flyweight = new HashMap<>();
	
	public static BoxFlyweight getFlyweight(String marca, int lados) {
		BoxFlyweight retorno = null;
		if(flyweight.get(marca) == null) {
			retorno = new BoxFlyweight(marca, lados);
			flyweight.put(marca, retorno);
		}else {
			retorno = flyweight.get(marca);
		}
		return retorno;
	}
}

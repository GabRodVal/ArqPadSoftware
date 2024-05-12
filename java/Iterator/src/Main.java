import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Clima>cl = new ArrayList<>();
		
		cl.add(new Clima(24.7, 60.0, "São Paulo"));
		cl.add(new Clima(31.5, 58.8, "Rio de Janeiro"));
		cl.add(new Clima(26.5, 66.4, "Niterói"));
		
		Lista dirList = new DiretoLista(cl);
		Iterator d1 = dirList.createCityIterator();
		d1.getCur().tempStatus();
		d1.getNext().tempStatus();
		d1.getNext().tempStatus();
		
		Lista revList = new ReversoLista(cl);
		Iterator r1 = revList.createCityIterator();
		r1.getCur().tempStatus();
		r1.getNext().tempStatus();
		r1.getNext().tempStatus();
		
	}
	
}

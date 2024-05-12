import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Transport> transp = new ArrayList<>();
		
		Bus b1 = new Bus(50,50, 457);
		transp.add(b1);

		Bus b2 = new Bus(0,0, 655);
		transp.add(b2);
		
		Train t1 = new Train(450, 450, 22);
		transp.add(t1);
		
		Train t2 = new Train(1200, 200, 36);
		transp.add(t2);
		
		Visitor v1 = new CityVisitor();
		Visitor v2 = new StateVisitor();
		
		for(int f = 0; f<transp.size(); f++) {
			transp.get(f).accept(v1);
			transp.get(f).accept(v2);
		}
	}
}

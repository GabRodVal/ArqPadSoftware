
public class CityVisitor implements Visitor{

	@Override
	public void visitBus(Bus b) {
		if(b.x > 200 || b.x <50 || b.y>300 || b.y <150) {
			System.out.println("O onibus "+b.id+" saiu da cidade");
		}else {
			System.out.println("O onibus "+b.id+" continua na cidade");
		}
		
	}

	@Override
	public void visitTrain(Train t) {
		if(t.x > 200 || t.x <50 || t.y>300 || t.y <150) {
			System.out.println("O trem "+t.id+" saiu da cidade");
		}else {
			System.out.println("O trem "+t.id+" continua na cidade");
		}
		
	}

}

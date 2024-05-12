
public class StateVisitor implements Visitor{

	@Override
	public void visitBus(Bus b) {
		if(b.x > 450 || b.x <0 || b.y>600 || b.y <45) {
			System.out.println("O onibus "+b.id+" saiu do estado");
		}else {
			System.out.println("O onibus "+b.id+" continua no estado");
		}
		
	}

	@Override
	public void visitTrain(Train t) {
		if(t.x > 450 || t.x <0 || t.y>600 || t.y <45) {
			System.out.println("O trem "+t.id+" saiu do estado");
		}else {
			System.out.println("O trem "+t.id+" continua no estado");
		}
		
	}

}

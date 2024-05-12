
public class Bus extends Transport{

	public Bus(int x, int y, long id) {
		super(x, y, id);
	}

	@Override
	public void accept(Visitor tv) {
		tv.visitBus(this);
	}

	@Override
	public void printLocation() {
		System.out.println("O ônibus se moveu para: X = "+x+" Y = "+y);
		
	}

}

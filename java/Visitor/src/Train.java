
public class Train extends Transport{
	
	
	public Train(int x, int y, long id) {
		super(x, y, id);
	}

	@Override
	public void accept(Visitor tv) {
		tv.visitTrain(this);
	}

	@Override
	public void printLocation() {
		System.out.println("O trem se moveu para: X = "+x+" Y = "+y);
		
	}

}

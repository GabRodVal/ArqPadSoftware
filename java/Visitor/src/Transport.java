
public abstract class Transport {
	protected int x, y;
	protected long id;
	
	public Transport(int x, int y, long id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void printLocation();
	
	public abstract void accept(Visitor tv);
}

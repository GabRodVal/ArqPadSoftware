
public abstract class IoT {
	
	protected Mediator mediator;
	protected int id;
	protected String type;
	protected boolean isOn = false;
	
	public IoT(Mediator mediator, int id) {
		this.mediator = mediator;
		this.id = id;
	}	
	
	protected abstract void power();
	
	protected abstract void doSomething();
	
	public int getId() {
		return id;
	}
	
	
	public String getType() {
		return type;
	}



}

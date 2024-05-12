
public class TV extends IoT{

	public TV(Mediator mediator, int id) {
		super(mediator, id);
		this.type = "Televisão";
	}

	@Override
	protected void power() {
		mediator.powerTV();
		
	}

	@Override
	protected void doSomething() {
		mediator.changeChannels();
		
	}

}

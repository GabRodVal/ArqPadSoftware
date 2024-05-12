
public class Lamp extends IoT{

	public Lamp(Mediator mediator, int id) {
		super(mediator, id);
		this.type = "Lâmpada";
	}

	@Override
	protected void doSomething() {
		mediator.flickerLight();
		
	}

	@Override
	protected void power() {
		mediator.powerLamp();
		
	}

}


public class AC extends IoT{

	public AC(Mediator mediator, int id) {
		super(mediator, id);
		this.type = "Ar-Condicionado";
	}

	@Override
	protected void power() {
		mediator.powerAC();
		
	}

	@Override
	protected void doSomething() {
		mediator.lowerTemp();
	}

}

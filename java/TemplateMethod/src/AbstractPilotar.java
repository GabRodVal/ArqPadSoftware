
public abstract class AbstractPilotar {
	
	protected double speed = 0;
	protected double maxSpeed;
	protected double acceleration;
	
	public void drive() {
		
		unlock();
		enter();
		ignite();
		
		
		while(speed<maxSpeed) {
			accelerate();
		}
		
		System.out.println("Velocidade máxima alcançada!");
	}

	public void unlock() {
		System.out.println("Veiculo destrancado");
	}
	
	public void ignite() {
		System.out.println("Ignição do veiculo ligada");
	}
	
	public abstract void enter();
	
	public abstract void accelerate();
	
	
	
	
	
}

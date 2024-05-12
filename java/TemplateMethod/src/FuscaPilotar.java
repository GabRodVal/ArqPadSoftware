
public class FuscaPilotar extends AbstractPilotar{

	public FuscaPilotar() {
		this.maxSpeed = 100;
		this.acceleration = 8.2;
	}

	public void enter() {
		System.out.println("Entrou no fusca");
		
	}

	public void accelerate() {
		speed += acceleration;
		System.out.println("O fusca acelerou! Velocidade atual: "+speed);
	}
	
}


public class CaminhaoPilotar extends AbstractPilotar {
	
	public CaminhaoPilotar() {
		this.maxSpeed = 100;
		this.acceleration = 12.5;
	}

	public void enter() {
		System.out.println("Entrou no caminhão");
		
	}

	public void accelerate() {
		speed += acceleration;
		System.out.println("O caminhão acelerou! Velocidade atual: "+speed);
	}

}

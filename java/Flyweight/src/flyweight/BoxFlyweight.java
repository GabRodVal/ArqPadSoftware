package flyweight;

public class BoxFlyweight extends Flyweight{
	
	private String marca;	
	private int lados;
	
	BoxFlyweight(String marca, int lados){
		this.marca = marca;
		this.lados = lados;
	}

	@Override
	public void printInfo(String info) {
		System.out.println("Marc: "+marca+" lados: "+lados);
	}

	String getMarca() {
		return marca;
	}
	int getLados() {
		return lados;
	}
}

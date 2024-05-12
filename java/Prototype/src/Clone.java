
public abstract class Clone {
	protected double altura, peso;
	
	public Clone(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}
	
	public Clone(Clone cl) {
		this.altura = cl.altura;
		this.peso = cl.peso;
	}
	
	public abstract Clone clonar();

}


public class Memento {
	private double altura;
	
	private double largura;
	
	private double profundidade;
	
	public Memento(double altura, double largura, double profundidade) {
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}
	
	public void printStates() {
		System.out.println("Alt: "+altura+" Larg: "+ largura + " Prof: "+ profundidade);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}


}

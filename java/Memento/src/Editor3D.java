
public class Editor3D {
	private double altura = 1;
	
	private double largura = 1;
	
	private double profundidade = 1;
	
	public Memento createMemento() {
		return new Memento(altura,largura,profundidade);
	}
	
	public void setMemento (Memento m) {
		this.altura = m.getAltura();
		this.largura = m.getLargura();
		this.profundidade = m.getProfundidade();
	}
	
	public void scaleAltura(double altMod) {
		this.altura *= altMod;
	}
	
	public void scaleLargura(double largMod) {
		this.largura *= largMod;
	}
	
	public void scaleProfundidade(double profMod) {
		this.profundidade *= profMod;
	}
	
	public void scaleAll(double sizeMod) {
		this.altura *= sizeMod;
		this.largura *= sizeMod;
		this.profundidade *= sizeMod;
		
	}
}


public abstract class Marcha {
	protected Carro carro;
	
	private int curMarcha = 1;
	private boolean isRe;
	
	public Marcha(Carro carro) {
		this.carro = carro;
	}

	public void setMarcha(int marcha) {

		System.out.println("A marcha foi de " + this.curMarcha +  " para: "+marcha);
		
		this.curMarcha = marcha;
		carro.acelerar(marcha);
	}

	public void setRe(boolean isRe) {
		
		this.isRe = isRe;
		
		if(this.isRe == true) {
			System.out.println("A marcha está em ré");
		}else {
			System.out.println("A marcha está fora de ré");
		}
		
		carro.re(isRe);
	}

}

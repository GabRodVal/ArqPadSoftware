
public class Uno extends Carro{

	public void acelerar(int marcha) {
		if(this.curMarcha > marcha) {
			System.out.println("O Uno desacelerou");
		}else if (this.curMarcha < marcha) {
			System.out.println("O Uno acelerou!");
		}else {
			System.out.println("A aceleração do Uno não mudou");
		}
		
		this.curMarcha = marcha;
		
	}

	public void re(boolean isRe) {
		if(isRe == true) {
			System.out.println("O Uno está para dar ré");
		}else {
			System.out.println("O Uno não está dando ré");
		}
		
		this.isRe = isRe;
		
	}
	
}

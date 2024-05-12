
public class Palio extends Carro{

	public void acelerar(int marcha) {
		if(this.curMarcha > marcha) {
			System.out.println("O Palio desacelerou");
		}else if (this.curMarcha < marcha) {
			System.out.println("O Palio acelerou!");
		}else {
			System.out.println("A aceleração do Palio não mudou");
		}
		
		this.curMarcha = marcha;
		
	}

	public void re(boolean isRe) {
		if(isRe == true) {
			System.out.println("O Palio está para dar ré");
		}else {
			System.out.println("O Palio não está dando ré");
		}
		
		this.isRe = isRe;
		
	}
	
}

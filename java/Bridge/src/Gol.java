
public class Gol extends Carro {

	public void acelerar(int marcha) {
		if(this.curMarcha > marcha) {
			System.out.println("O Gol desacelerou");
		}else if (this.curMarcha < marcha) {
			System.out.println("O Gol acelerou!");
		}else {
			System.out.println("A aceleração do Gol não mudou");
		}
		
		this.curMarcha = marcha;
		
	}

	public void re(boolean isRe) {
		if(isRe == true) {
			System.out.println("O Gol está para dar ré");
		}else {
			System.out.println("O Gol não está dando ré");
		}
		
		this.isRe = isRe;
		
	}

}


public class Main {

	public static void main(String[] args) {
		
		Marcha marchaPalio = new ManualMarcha(new Palio());
		
		
		marchaPalio.setMarcha(1);
		marchaPalio.setMarcha(5);
		marchaPalio.setMarcha(3);
		marchaPalio.setRe(true);
		
		Marcha marchaGol = new AutoMarcha(new Gol());
		
		marchaGol.setMarcha(4);
		marchaGol.setRe(false);
		
		Marcha marchaUno = new ManualMarcha(new Uno());
		
		marchaUno.setMarcha(5);
		marchaUno.setMarcha(1);
		
	}
}

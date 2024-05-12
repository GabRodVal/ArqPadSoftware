
public class Main {
	
	
	public static void main(String[] args) {
		Sanduiche sanduba = new TomateDecorator(new QueijoDecorator(new CarneDecorator(new Restaurante())));
		sanduba.montar();
	}
	
	
}

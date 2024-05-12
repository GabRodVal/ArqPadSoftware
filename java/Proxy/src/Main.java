
public class Main {

	public static void main(String[] args) {
		Correspondencia cor = new Intermediario(new Destinatario());
		
		cor.enviarCarta();
		cor.enviarPacote();
		
		cor = new Destinatario();
		
		cor.enviarCarta();
		cor.enviarPacote();
	}
	
}

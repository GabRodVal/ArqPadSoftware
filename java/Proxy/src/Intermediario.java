
public class Intermediario implements Correspondencia{
	
	private Destinatario dest;
	
	public Intermediario(Destinatario dest) {
		this.dest = dest;
	}

	public void enviarCarta() {
		System.out.println("A carta passou por um intermediario");
		dest.enviarCarta();
	}

	public void enviarPacote() {
		System.out.println("O pacote passou por um intermediario");
		dest.enviarPacote();
	}

}

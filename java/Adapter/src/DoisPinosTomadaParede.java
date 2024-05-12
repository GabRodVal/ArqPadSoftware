
public class DoisPinosTomadaParede implements TomadaParede{
	@SuppressWarnings("unused")
	private TomadaCabo tc2;
	private boolean isConnected = false;

	public void conectar(TomadaCabo tc) {
		System.out.println("Conectando...");
		if(tc.getPinos() == 2) {
			isConnected = true;
			tc2 = tc;
			System.out.println("A tomada conectou!");
		}else {
			isConnected = false;
			System.out.println("Não é possível conectar!");
		}
		
	}
	public boolean isConnected() {
		return isConnected;
	}

	public void desconectar() {
		isConnected = false;
		tc2 = null;
		System.out.println("Desconectado");
	}

}

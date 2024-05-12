
public class TresPinosTomadaParede implements TomadaParede{
	@SuppressWarnings("unused")
	private TomadaCabo tc3;
	private boolean isConnected = false;

	public void conectar(TomadaCabo tc) {
		System.out.println("Conectando...");
		if(tc.getPinos() == 3) {
			isConnected = true;
			tc3 = tc;
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
		tc3 = null;
		System.out.println("Desconectado");
	}

}

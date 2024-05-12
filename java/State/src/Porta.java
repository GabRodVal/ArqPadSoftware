
public class Porta {
	
	private StatePorta pState = new FechadaPorta();
	
	public void abrir() {
		pState.abrir();
		pState = new AbertaPorta();
	}
	
	public void fechar() {
		pState.fechar();
		pState = new FechadaPorta();
	}
	
	public void encostar() {
		pState.enconstar();
		pState = new EncostadaPorta();
	}
}

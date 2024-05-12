
public class FechadaPorta implements StatePorta{

	@Override
	public void abrir() {
		System.out.println("A porta fechada foi aberta");
		
	}

	@Override
	public void fechar() {
		System.out.println("A porta já está fechada");
		
	}

	@Override
	public void enconstar() {
		System.out.println("A porta fechada foi encostada");
		
	}

}


public class EncostadaPorta implements StatePorta{

	@Override
	public void abrir() {
		System.out.println("A porta encostada foi aberta");
		
	}

	@Override
	public void fechar() {
		System.out.println("A porta encostada foi fechada");
		
	}

	@Override
	public void enconstar() {
		System.out.println("A porta já está encostada");
		
	}

}

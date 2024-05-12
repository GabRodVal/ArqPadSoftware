
public class AbertaPorta implements StatePorta{

	@Override
	public void abrir() {
		System.out.println("A porta já está aberta");
		
	}

	@Override
	public void fechar() {
		System.out.println("A porta aberta foi fechada");
		
	}

	@Override
	public void enconstar() {
		System.out.println("A porta aberta foi encostada");
		
	}

}

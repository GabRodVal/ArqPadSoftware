
public class QueijoDecorator extends SanduicheDecorator{

	public QueijoDecorator(Sanduiche sanduicheDec) {
		super(sanduicheDec);
	}

	@Override
	public void montar() {
		sanduicheDec.montar();
		montarQueijo();
	}
	
	private void montarQueijo() {
		System.out.println("O sanduiche agora tem: Queijo");
	}

}

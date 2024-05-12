
public class TomateDecorator extends SanduicheDecorator{

	public TomateDecorator(Sanduiche sanduicheDec) {
		super(sanduicheDec);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void montar() {
		sanduicheDec.montar();
		montarTomate();
	}
	
	private void montarTomate() {
		System.out.println("O sanduiche agora tem: Tomate");
	}

}

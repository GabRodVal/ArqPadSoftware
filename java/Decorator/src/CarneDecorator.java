
public class CarneDecorator extends SanduicheDecorator{

	public CarneDecorator(Sanduiche sanduicheDec) {
		super(sanduicheDec);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void montar() {
		sanduicheDec.montar();
		montarCarne();
	}
	
	private void montarCarne() {
		System.out.println("O sanduiche agora tem: Carne");
	}

}

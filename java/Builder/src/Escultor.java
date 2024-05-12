
public class Escultor {

	public void esculpirAnjo(Esculpir esc) {
		esc.modelarCabeca();
		esc.modelarCorpo();
		esc.modelarPernas();
		esc.modelarAsas();
	}
	
	public void esculpirMonstro(Esculpir esc) {
		esc.modelarCorpo();
		esc.modelarBracos();
		esc.modelarCauda();
	}
}

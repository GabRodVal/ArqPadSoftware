
public class GeloEsculpir implements Esculpir{
	
	GeloEstatua gEstatua = new GeloEstatua();
	
	public GeloEstatua getGeloEstatua() {
		return gEstatua;
	}
	
	public void reiniciar() {
		gEstatua = new GeloEstatua();
		
	}

	public void modelarCabeca() {
		gEstatua.setHasCabeca(true);
		
	}

	public void modelarCorpo() {
		gEstatua.setHasCorpo(true);
		
	}

	public void modelarBracos() {
		gEstatua.setHasBracos(true);		
	}

	public void modelarPernas() {
		gEstatua.setHasPernas(true);
		
	}

	public void modelarAsas() {
		gEstatua.setHasAsas(true);		
	}

	public void modelarCauda() {
		gEstatua.setHasCauda(true);		
	}

}

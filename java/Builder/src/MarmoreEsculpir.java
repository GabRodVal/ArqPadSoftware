
public class MarmoreEsculpir implements Esculpir{
	MarmoreEstatua mEstatua = new MarmoreEstatua();
	
	public MarmoreEstatua getMarmoreEstatua() {
		return mEstatua;
	}
	
	public void reiniciar() {
		mEstatua = new MarmoreEstatua();
		
	}

	public void modelarCabeca() {
		mEstatua.setHasCabeca(true);
		
	}

	public void modelarCorpo() {
		mEstatua.setHasCorpo(true);
		
	}

	public void modelarBracos() {
		mEstatua.setHasBracos(true);		
	}

	public void modelarPernas() {
		mEstatua.setHasPernas(true);
		
	}

	public void modelarAsas() {
		mEstatua.setHasAsas(true);		
	}

	public void modelarCauda() {
		mEstatua.setHasCauda(true);		
	}
}


public class Main {
	
	public static void main(String[] args) {
		Escultor director = new Escultor();
		
		GeloEsculpir gEsc = new GeloEsculpir();
		
		director.esculpirAnjo(gEsc);
		
		GeloEstatua gEstatua = gEsc.getGeloEstatua();
		
		gEstatua.showGeloEstatua();
		
		
		
		MarmoreEsculpir mEsc = new MarmoreEsculpir();
		
		director.esculpirMonstro(mEsc);
		
		MarmoreEstatua mEstatua = mEsc.getMarmoreEstatua();
		
		mEstatua.showMarmoreEstatua();
	}
}


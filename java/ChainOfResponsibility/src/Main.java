
public class Main {
	public static void main(String[] args) {
		Estudante e1 = new Estudante("Bernardo", 3);
		
		Estudante e2 = new Estudante("João", 1);
		
		Estudante e3 = new Estudante("Carla", 0);
		
		FundamentalEduc fE = new FundamentalEduc(null);
		
		MedioEduc mE = new MedioEduc(fE);
		
		GraduacaoEduc gE = new GraduacaoEduc(mE);
		
		gE.checkEduc(e1);
		gE.checkEduc(e2);
		gE.checkEduc(e3);
		
		mE.checkEduc(e1);
		mE.checkEduc(e2);
		mE.checkEduc(e3);
		
		fE.checkEduc(e1);
		fE.checkEduc(e2);
		fE.checkEduc(e3);
	}
}

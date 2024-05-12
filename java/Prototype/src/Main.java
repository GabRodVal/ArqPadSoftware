
public class Main {
	public static void main(String[] args) {
		Ovelha dolly = new Ovelha(1.20, 60.0, "Dolly");
		
		dolly.identificarOvelha();
		
		Clone c = dolly.clonar();
		
		Ovelha dolly2 = (Ovelha) c;
		
		dolly2.identificarOvelha();

	}
}

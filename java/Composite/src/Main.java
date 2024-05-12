
public class Main {

	public static void main(String[] args) {
		Unidade eA = new Unidade("Esquadrão", "Alfa");
		Unidade eB = new Unidade("Esquadrão", "Beta");
		
		Soldado s1 = new Soldado("Charlie");
		Soldado s2 = new Soldado("Bruno");
		Soldado s3 = new Soldado("Jeremias");
		Soldado s4 = new Soldado("Ryan");
		Soldado s5 = new Soldado("Miguel");
		Soldado s6 = new Soldado("Tadashi");
		
		Unidade p097 = new Unidade("Pelotão","097");
		p097.add(s1);
		p097.add(s2);
		
		Unidade p118 = new Unidade("Pelotão","118");
		p118.add(s3);
		
		Unidade p227 = new Unidade("Pelotão","227");
		p227.add(s4);
		p227.add(s5);
		p227.add(s6);
		
		eA.add(p097);
		eA.add(p118);
		eA.marchar();
		
		eB.add(p227);
		eB.marchar();
		
		
	}
	
}

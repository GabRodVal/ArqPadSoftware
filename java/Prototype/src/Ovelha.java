
public class Ovelha extends Clone{
	private String name;
	
	public Ovelha(double altura, double peso, String name) {
		super(altura, peso);
		this.name = name;
	}
	
	public Ovelha(Ovelha ov) {
		super(ov);
		this.name = ov.name;
	}

	@Override
	public Clone clonar() {
		return new Ovelha(this);
	}
	
	public void identificarOvelha() {
		System.out.println("A ovelha "+name+" tem "+altura+"m e "+peso+" quilos");
	}

	public String getName() {
		return name;
	}

}

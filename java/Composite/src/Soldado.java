
public class Soldado implements Exercito{
	private String name;
	
	public Soldado(String name) {
		this.name = name;
	}

	public void marchar() {
		System.out.println("O soldado "+name+" está marchando!");
	}

	public String getName() {
		return name;
	}

}


public class Estudante {
	private String name;
	private boolean hasFundamental;
	private boolean hasMedio;
	private boolean hasGraduacao;
	
	public Estudante(String name, int educ) {
		this.name = name;
		
		
		switch (educ) {
			case 0:
				this.hasFundamental = false;
				this.hasMedio = false;
				this.hasGraduacao = false;
				break;
			case 1: 
				this.hasFundamental = true;
				this.hasMedio = false;
				this.hasGraduacao = false;
				break;
			case 2:
				this.hasFundamental = true;
				this.hasMedio = true;
				this.hasGraduacao = false;
				break;
			case 3:
				this.hasFundamental = true;
				this.hasMedio = true;
				this.hasGraduacao = true;
				break;
			default:
				System.out.println("Valor invalido, escolha um valor entre 0 e 3");
		}
	}

	public String getName() {
		return name;
	}

	public boolean hasFundamental() {
		return hasFundamental;
	}

	public boolean hasMedio() {
		return hasMedio;
	}

	public boolean hasGraduacao() {
		return hasGraduacao;
	}
	
}

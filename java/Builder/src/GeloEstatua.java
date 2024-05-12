
public class GeloEstatua {
	private boolean hasCabeca;
	private boolean hasCorpo;
	private boolean hasBracos;
	private boolean hasPernas;
	private boolean hasAsas;
	private boolean hasCauda;
	
	public void showGeloEstatua() {
		System.out.println("Esta estátua de gelo tem: ");
		if(hasCabeca == true) {
			System.out.println("Uma cabeça");
		}
		if(hasCorpo == true) {
			System.out.println("Um corpo");
		}
		if(hasBracos == true) {
			System.out.println("Dois braços");
		}
		if(hasPernas == true) {
			System.out.println("Duas pernas");
		}
		if(hasAsas == true) {
			System.out.println("Um par de asas");
		}
		if(hasCauda == true) {
			System.out.println("Uma cauda");
		}
	}
	
	public boolean isHasCabeca() {
		return hasCabeca;
	}
	public void setHasCabeca(boolean hasCabeca) {
		this.hasCabeca = hasCabeca;
	}
	public boolean isHasCorpo() {
		return hasCorpo;
	}
	public void setHasCorpo(boolean hasCorpo) {
		this.hasCorpo = hasCorpo;
	}
	public boolean isHasBracos() {
		return hasBracos;
	}
	public void setHasBracos(boolean hasBracos) {
		this.hasBracos = hasBracos;
	}
	public boolean isHasPernas() {
		return hasPernas;
	}
	public void setHasPernas(boolean hasPernas) {
		this.hasPernas = hasPernas;
	}
	public boolean isHasAsas() {
		return hasAsas;
	}
	public void setHasAsas(boolean hasAsas) {
		this.hasAsas = hasAsas;
	}
	public boolean isHasCauda() {
		return hasCauda;
	}
	public void setHasCauda(boolean hasCauda) {
		this.hasCauda = hasCauda;
	}

}

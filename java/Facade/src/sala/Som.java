package sala;

class Som {
	private boolean isOn = false;
	
	public void ligarSom(){
		if(!isOn) {
			isOn = true;
			System.out.println("O aparelho de som foi ligado");
		}else {
			System.out.println("O aparelho de som já está ligado!");
		}
	}
	
	public void desligarSom(){
		if(isOn) {
			isOn = false;
			System.out.println("O aparelho de som foi desligado");
		}else {
			System.out.println("O aparelho de som já está desligado!");
		}
	}

	public boolean isOn() {
		return isOn;
	}
}

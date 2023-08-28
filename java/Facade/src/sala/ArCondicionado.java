package sala;

class ArCondicionado {
	private boolean isOn = false;
	
	public void ligarArCondicionado(){
		if(!isOn) {
			isOn = true;
			System.out.println("O ar condicionado foi ligado");
		}else {
			System.out.println("O ar condicionado já está ligado!");
		}
	}
	
	public void desligarArCondicionado(){
		if(isOn) {
			isOn = false;
			System.out.println("O ar condicionado foi desligado");
		}else {
			System.out.println("O ar condicionado já está desligado!");
		}
	}

	public boolean isOn() {
		return isOn;
	}

}

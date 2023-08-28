package sala;

class TV {
	private boolean isOn = false;
	
	public void ligarTV(){
		if(!isOn) {
			isOn = true;
			System.out.println("A televisão foi ligada");
		}else {
			System.out.println("A televisão já está ligada!");
		}
	}
	
	public void desligarTV(){
		if(isOn) {
			isOn = false;
			System.out.println("A televisão foi desligada");
		}else {
			System.out.println("A televisão já está desligada!");
		}
	}

	public boolean isOn() {
		return isOn;
	}

}

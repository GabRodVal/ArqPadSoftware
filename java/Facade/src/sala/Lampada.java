package sala;

class Lampada {
	private boolean isOn = false;
	
	public void ligarLampada(){
		if(!isOn) {
			isOn = true;
			System.out.println("As luzes foram ligadas");
		}else {
			System.out.println("As luzes já estão ligadas!");
		}
	}
	
	public void desligarLampada(){
		if(isOn) {
			isOn = false;
			System.out.println("As luzes foram desligadas");
		}else {
			System.out.println("As luzes já estão desligadas!");
		}
	}

	public boolean isOn() {
		return isOn;
	}

}

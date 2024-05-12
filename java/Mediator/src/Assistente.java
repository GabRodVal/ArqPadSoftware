
public class Assistente implements Mediator{
	private TV televisao;
	private AC arCondicionado;
	private Lamp lampada;

	
	public void powerTV() {
		televisao.isOn = !televisao.isOn;
		
		if(televisao.isOn == true) {
			System.out.println("Televisão:"+televisao.id+" ligada!");
		}else {
			System.out.println("Televisão:"+televisao.id+" desligada!");
		}
		
	}

	public void changeChannels() {
		System.out.println("A Televisão:"+televisao.id+" mudou de canal");
		
	}

	public void powerLamp() {
		lampada.isOn = !lampada.isOn;
		
		if(lampada.isOn == true) {
			System.out.println("Lâmpada:"+lampada.id+" ligada!");
		}else {
			System.out.println("Lâmpada:"+lampada.id+" desligada!");
		}
		
	}

	public void flickerLight() {
		System.out.println("A Lâmpada:"+lampada.id+" esta piscando");
		
	}

	public void powerAC() {
		arCondicionado.isOn = !arCondicionado.isOn;
		
		if(arCondicionado.isOn == true) {
			System.out.println("Ar-Condicionado:"+arCondicionado.id+" ligado!");
		}else {
			System.out.println("Ar-Condicionado:"+arCondicionado.id+" desligado!");
		}
		
	}

	public void lowerTemp() {
		System.out.println("O Ar-Condicionado:"+arCondicionado.id+" diminuiu a temperatura");
		
	}

	public Lamp getLampada() {
		return lampada;
	}

	public void setLampada(Lamp lampada) {
		this.lampada = lampada;
	}

	public AC getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(AC arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public TV getTelevisao() {
		return televisao;
	}

	public void setTelevisao(TV televisao) {
		this.televisao = televisao;
	}


}

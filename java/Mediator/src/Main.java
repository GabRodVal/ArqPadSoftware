
public class Main {
	
	public static void main(String[] args) {
		Assistente alx = new Assistente();
		
		AC ac = new AC(alx,1);
		alx.setArCondicionado(ac);
		
		TV tv = new TV(alx,1);
		alx.setTelevisao(tv);
		
		Lamp l1 = new Lamp(alx,1);
		alx.setLampada(l1);
		Lamp l2 = new Lamp(alx,2);
		
		alx.getArCondicionado().doSomething();
		alx.changeChannels();
		alx.flickerLight();
		
		alx.setLampada(l2);
		alx.flickerLight();
	}
	
}

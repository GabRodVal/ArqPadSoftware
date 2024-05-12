
public class SmartphoneObserver implements Observer{

	private ConcretePublisher cPub;
	
	public SmartphoneObserver(ConcretePublisher cPub) {
		this.cPub = cPub;
	}
	
	@Override
	public void update() {
		System.out.println("O celular foi notificado em: "+cPub.getTime());
		
	}

	@Override
	public void doSomething() {
		System.out.println("Celular ligado");
		
	}

}

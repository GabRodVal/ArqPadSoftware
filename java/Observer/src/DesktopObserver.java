
public class DesktopObserver implements Observer{

	private ConcretePublisher cPub;
	
	public DesktopObserver(ConcretePublisher cPub) {
		this.cPub = cPub;
	}
	
	@Override
	public void update() {
		System.out.println("O desktop foi notificado em: "+cPub.getTime());
		
	}

	@Override
	public void doSomething() {
		System.out.println("Desktop ligado");
		
	}

}

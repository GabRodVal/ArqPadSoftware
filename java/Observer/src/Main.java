import java.util.Date;

public class Main {

	
	public static void main(String[] args) {
		ConcretePublisher cPublisher = new ConcretePublisher();
		
		cPublisher.inscrever(new DesktopObserver(cPublisher));
		cPublisher.inscrever(new SmartphoneObserver(cPublisher));
		
		cPublisher.notifyObserver();
		
		cPublisher.setTime(new Date());
		
		//cPublisher.se
	}
	
}

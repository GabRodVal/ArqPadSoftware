import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
	private List<Observer> observers = new ArrayList<>();
	
	public void inscrever(Observer ob) {
		this.observers.add(ob);
	}
	
	public void desinscrever(Observer ob) {
		this.observers.remove(ob);
	}
	
	public void notifyObserver() {
		for (int f = 0; f<this.observers.size();f++) {
			this.observers.get(f).update();
		}
	}
	
	
}

import java.util.Stack;

public class Caretaker {
	
	private Editor3D orig;
	
	private Stack<Memento> historico = new Stack<Memento>();
	
	public Caretaker(Editor3D orig) {
		this.orig = orig;
	}
	
	public void save() {
		historico.push(orig.createMemento());
		System.out.println("Salvar!");
		historico.lastElement().printStates();
	}
	
	public void undo() {
		orig.setMemento(historico.pop());
		System.out.println("Undo!");
		historico.lastElement().printStates();
	}
	

}


public class Main {
	
	public static void main(String[] args) {
		Editor3D e3d = new Editor3D();
		Caretaker c = new Caretaker(e3d);
		
		c.save();
		e3d.scaleAltura(1.5);
		e3d.scaleLargura(2);
		c.save();
		e3d.scaleAltura(2);
		e3d.scaleProfundidade(0.5);
		c.save();
		e3d.scaleAll(5);
		c.save();
		
		c.undo();
		c.undo();
		c.undo();
	}
}

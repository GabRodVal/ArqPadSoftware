
public class Main {

	public static void main(String[] args) {
		AbstractPilotar cam = new CaminhaoPilotar();
		AbstractPilotar fus = new FuscaPilotar();
		
		cam.drive();
		fus.drive();
	}
	
}

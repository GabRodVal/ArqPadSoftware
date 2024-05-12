
public class Main {
	public static void main(String[] args) {
		TresPinosTomadaCabo tc3 = new TresPinosTomadaCabo();
		DoisPinosTomadaCabo tc2 = new DoisPinosTomadaCabo();
		
		TomadaParede tp3 = new TresPinosTomadaParede();
		TomadaParede tp2 = new DoisPinosTomadaParede();
		
		tp2.conectar(tc2);
		tp3.conectar(tc3);
		
		tp2.conectar(tc3);
		tp3.conectar(tc2);
		
		tp2.conectar(new TresParaDoisBenjamin(tc3));
		tp3.conectar(new DoisParaTresBenjamin(tc2));
	}
}

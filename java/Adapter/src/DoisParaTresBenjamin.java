
public class DoisParaTresBenjamin extends TomadaCabo implements TomadaParede{
	@SuppressWarnings("unused")
	private TomadaCabo tc2;
	
	public DoisParaTresBenjamin(DoisPinosTomadaCabo dptc) {
		this.tc2= dptc;
		this.pinos = 3;
	}

	public void conectar(TomadaCabo tc) {
		if(tc.pinos == 2) {
			this.tc2 = tc;
		}else {
			System.out.println("Benjamin incompativel");
		}
		
	}

	public void desconectar() {
		this.tc2 = null;		
	}

}

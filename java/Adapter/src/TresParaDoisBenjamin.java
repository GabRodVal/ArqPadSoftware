
public class TresParaDoisBenjamin extends TomadaCabo implements TomadaParede{
	@SuppressWarnings("unused")
	private TomadaCabo tc3;
	
	public TresParaDoisBenjamin(TresPinosTomadaCabo tptc) {
		this.tc3= tptc;
		this.pinos = 2;
	}

	public void conectar(TomadaCabo tc) {
		if(tc.pinos == 3) {
			this.tc3 = tc;
		}else {
			System.out.println("Benjamin incompativel");
		}
		
	}

	public void desconectar() {
		this.tc3 = null;		
	}

}

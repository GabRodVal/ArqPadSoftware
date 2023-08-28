package sala;

public class SalaFacade {
	private ArCondicionado arCondicionado;
	private Lampada lampada;
	private Som som;
	private TV tv;
	
	public SalaFacade() {
		this.arCondicionado = new ArCondicionado();
		this.lampada = new Lampada();
		this.som = new Som();
		this.tv = new TV();
	}
	
	public void ligarSala() {
		arCondicionado.ligarArCondicionado();
		lampada.ligarLampada();
		som.ligarSom();
		tv.ligarTV();
	}
	
	public void desligarSala() {
		arCondicionado.desligarArCondicionado();
		lampada.desligarLampada();
		som.desligarSom();
		tv.desligarTV();
	}

}

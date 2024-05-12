import java.util.ArrayList;
import java.util.List;

public class DiretoLista implements Lista{

	private List<Clima> climaList;
	
	public DiretoLista(List<Clima> climaList) {
		if(climaList != null) {
			this.climaList = climaList;
		}else {
			this.climaList = new ArrayList<>();
		}
	}
	
	@Override
	public Iterator createCityIterator() {
		return new DiretoIterator(this);
	}


	@Override
	public void add(Clima cl) {
		this.climaList.add(cl);
		
	}

	@Override
	public void remove(Clima cl) {
		this.climaList.remove(cl);
	}

	@Override
	public Clima get(int g) {
		return this.climaList.get(g);
		
	}

	@Override
	public int size() {
		return this.climaList.size();
	}

}

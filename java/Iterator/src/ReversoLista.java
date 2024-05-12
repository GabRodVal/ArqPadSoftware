import java.util.ArrayList;
import java.util.List;

public class ReversoLista implements Lista{
	
	private List<Clima> climaList;
	
	public ReversoLista(List<Clima> climaList) {
		if(climaList != null) {
			this.climaList = climaList;
		}else {
			this.climaList = new ArrayList<>();
		}
	}

	@Override
	public Iterator createCityIterator() {
		return new ReversoIterator(this);
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

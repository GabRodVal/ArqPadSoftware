public class DiretoIterator implements Iterator{
	
	private int curPosition = 0;
	
	private DiretoLista dl;
	
	public DiretoIterator(DiretoLista dl) {
		this.dl = dl;
	}
	

	public boolean hasNext() {
		return dl.get(curPosition+1) != null;
	}
	
	public Clima getCur() {
		return dl.get(curPosition);
	}

	public Clima getNext() {
		if(!hasNext()) {
			return null;
		}
		
		curPosition++;
		
		return dl.get(curPosition);
	}

	public void toStart() {
		curPosition = 0;
	}

	public void toEnd() {
		curPosition = dl.size();
	}

}

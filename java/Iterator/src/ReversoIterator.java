public class ReversoIterator implements Iterator{
	
	private int curPosition = 1;
	
	private ReversoLista rl;
	
	public ReversoIterator(ReversoLista rl) {
		this.rl = rl;
	}

	public boolean hasNext() {
		return rl.get(rl.size() - (curPosition+1)) != null;
	}

	public Clima getCur() {
		return rl.get(rl.size() - curPosition);
	}
	
	public Clima getNext() {
		if(!hasNext()) {
			return null;
		}
		
		curPosition++;
		return rl.get(rl.size()- curPosition);
	}

	public void toStart() {
		curPosition = 0;
	}

	public void toEnd() {
		curPosition = rl.size();
	}

}

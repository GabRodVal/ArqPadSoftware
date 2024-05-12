
public interface Iterator {
	boolean hasNext();
	
	Clima getCur();
	
	Clima getNext();
	
	void toStart();
	
	void toEnd();
}

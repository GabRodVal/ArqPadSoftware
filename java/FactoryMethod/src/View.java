
public abstract class View {
	public abstract Readable createReadable();
	
	public void newReadable() {
		Readable r = createReadable();
		r.readPage();
	}
}

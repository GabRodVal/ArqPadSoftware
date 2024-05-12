
public abstract class Carro {
	protected int curMarcha = 1;
	protected boolean isRe = false;
	
	public abstract void acelerar(int marcha);
	
	public abstract void re(boolean isRe);
}

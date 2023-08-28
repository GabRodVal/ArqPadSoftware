
public class Single {
	
	private static Single instancia;
	private String str;
	
	
	private Single(String str) {
		this.str = str;
	}


	public static Single getInstancia(String str) {
		if(instancia == null) {
			instancia = new Single(str);
		}
		return instancia;
	}


	public String getStr() {
		return str;
	}
	
	
}

import java.util.ArrayList;
import java.util.List;

public class Unidade implements Exercito{
	protected List<Exercito> subunidades = new ArrayList<>();
	private String name, uniType;
	
	public Unidade(String uniType, String name) {
		this.uniType = uniType;
		this.name = name;
	}

	public void add(Exercito ex) {
		subunidades.add(ex);
	}
	
	public void remove(Exercito ex) {
		subunidades.remove(ex);
	}
	
	public List<Exercito> getSubunidades() {
		return subunidades;
	}
	
	public void marchar() {
		System.out.println("O "+uniType+" "+name+" começou a marchar!");
		for(int f=0; f<subunidades.size();f++) {
			subunidades.get(f).marchar();
		}
		System.out.println("O "+uniType+" "+name+" terminou de marchar");
		
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return uniType;
	}

}

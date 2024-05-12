package flyweight;

public class Box {
	private int size;
	private long id;
	private String material;
	private BoxFlyweight bf;
	
	public Box(int size,long id, String material, BoxFlyweight bf) {
		this.size = size;
		this.id = id;
		this.material = material;
		this.bf = bf;
	}
	
	public void printBox() {
		System.out.println("Tamanho: "+size+" ID: "+id+" Material: "+material+" Marca: "+bf.getMarca()+" Lados: "+bf.getLados());
	}
}

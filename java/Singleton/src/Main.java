
public class Main {
	
	public static void main(String[] args) {
		
		Single firstSingleton = Single.getInstancia("Bom dia!");
		Single secondSingleton = Single.getInstancia("Boa noite!");
		System.out.println(firstSingleton.getStr());
		System.out.println(secondSingleton.getStr());
		
	}

}

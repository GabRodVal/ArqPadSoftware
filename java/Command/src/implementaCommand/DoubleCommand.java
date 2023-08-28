package implementaCommand;

public class DoubleCommand implements Command {

	@Override
	public int execute(int x) {
		x = x*2;
		System.out.println("Executou o comando Double, resultado: "+x+"!");
		return x;
	}

	public int undo(int x) {
		System.out.println("Comando Double desfeito, resultado: "+x+"!");
		return x;
	}

}

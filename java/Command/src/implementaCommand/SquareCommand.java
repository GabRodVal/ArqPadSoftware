package implementaCommand;

public class SquareCommand implements Command {

	@Override
	public int execute(int x) {
		x = x*x;
		System.out.println("Executou o comando Square, resultado: "+x+"!");
		return x;
	}

	@Override
	public int undo(int x) {
		System.out.println("Comando Square desfeito, resultado: "+x+"!");
		return x;
	}

}

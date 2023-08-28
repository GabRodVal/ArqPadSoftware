package implementaCommand;

public interface Command {
	public int execute(int x);

	public int undo(int x);
}

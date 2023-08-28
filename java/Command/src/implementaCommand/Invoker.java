package implementaCommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Invoker {
	public static Map<String, Command> comandos = new HashMap<String, Command>();
	
	private static List<Command> commandHistory = new ArrayList<Command>();
	private static List<Integer> intHistory = new ArrayList<Integer>();
	
	static {
		comandos.put("Double", new DoubleCommand());
		comandos.put("Square", new SquareCommand());
	}
	
	public static int invoke(String command, int x) {
		Command c = comandos.get(command);
		commandHistory.add(c);
		intHistory.add(x);
		return c.execute(x);
		
	}
	
	public static int undo() {
		try{
			int x = intHistory.get(intHistory.size()-1);
			intHistory.remove(intHistory.size()-1);
			Command c = commandHistory.get(commandHistory.size()-1);
			commandHistory.remove(commandHistory.size()-1);
			return c.undo(x);
		}catch(IndexOutOfBoundsException e) {
			return 0;
		}
	}

}

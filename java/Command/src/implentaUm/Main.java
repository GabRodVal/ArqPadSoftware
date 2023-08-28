package implentaUm;

import implementaCommand.Invoker;

public class Main {
	
	public static int number = 3;
	
	public static void main(String[] args) {
		number = Invoker.invoke("Square", number);
		number = Invoker.invoke("Double", number);
		number = Invoker.invoke("Square", number);
		number = Invoker.invoke("Square", number);
		number = Invoker.invoke("Double", number);
		number = Invoker.invoke("Double", number);
		number = Invoker.undo();
		number = Invoker.undo();
		number = Invoker.undo();
		number = Invoker.undo();
		number = Invoker.undo();
		number = Invoker.undo();
	}

}

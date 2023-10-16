
public class Book implements Readable{
	private int page = 1;
	
	@Override
	public void flipPage() {
		page++;
		System.out.println("Virando para a página "+page+" do livro");
		
	}

	@Override
	public void readPage() {
		System.out.println("O livro está na página "+page);
		
	}

}

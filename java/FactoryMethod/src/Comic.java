
public class Comic implements Readable{
	private int page = 1;

	@Override
	public void flipPage() {
		page++;
		System.out.println("Virando para a página "+page+" do quadrinho");
		
	}

	@Override
	public void readPage() {
		System.out.println("O quadrinho está na página "+page);
		
	}

}


public class Marketing {
	
	private Strategy marketingStrategy;
	
	public Marketing(Strategy str) {
		this.marketingStrategy = str;
	}
	
	
	public String marketMedia() {
		return marketingStrategy.marketMedia();
	}
	
	
	public void setMarketingStrategy(Strategy str) {
		this.marketingStrategy = str;
	}
	
}

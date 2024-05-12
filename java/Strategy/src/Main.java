
public class Main {

	public static void main(String[] args) {
		Marketing marketing = new Marketing(new TiktokStrategy());
		System.out.println(marketing.marketMedia());
		
		marketing.setMarketingStrategy(new InstagramStrategy());
		System.out.println(marketing.marketMedia());
		
		marketing.setMarketingStrategy(new TiktokStrategy());
		System.out.println(marketing.marketMedia());
	}
	
}

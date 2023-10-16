
public class MetalWorkshop implements Workshop{

	@Override
	public GolfClub createGolfClub() {
		// TODO Auto-generated method stub
		return new MetalGolfClub();
	}

	@Override
	public BaseballBat createBaseballBat() {
		// TODO Auto-generated method stub
		return new MetalBaseballBat();
	}

}

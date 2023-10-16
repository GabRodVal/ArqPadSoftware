
public class WoodWorkshop implements Workshop{

	@Override
	public GolfClub createGolfClub() {
		// TODO Auto-generated method stub
		return new WoodGolfClub();
	}

	@Override
	public BaseballBat createBaseballBat() {
		// TODO Auto-generated method stub
		return new WoodBaseballBat();
	}

}


public class SportStore {
	
	private BaseballBat bTaco;
	private GolfClub gTaco;
	
	public SportStore(Workshop ws) {
		bTaco = ws.createBaseballBat();
		gTaco = ws.createGolfClub();
		
		bTaco.hitBall();
		gTaco.hitBall();
		
	}
	
	public void setEquipment(Workshop ws) {
		bTaco = ws.createBaseballBat();
		gTaco = ws.createGolfClub();
		
		bTaco.hitBall();
		gTaco.hitBall();
	}
	
	public void swing() {
		bTaco.hitBall();
		gTaco.hitBall();
	}
}


public class Main {
	public static void main(String[] args) {
		SportStore spStore = new SportStore(new WoodWorkshop());
		
		spStore.swing();
		
		spStore.setEquipment(new MetalWorkshop());
		
		spStore.swing();
	}
}

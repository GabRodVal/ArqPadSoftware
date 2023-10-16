import java.util.UUID;

public class Customer {
	private String name;
	private String userId;
	
	public Customer(String name){
		this.name = name;
		this.userId = UUID.randomUUID().toString();
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	
}	


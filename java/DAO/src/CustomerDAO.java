import java.util.ArrayList;
import java.util.List;

public interface CustomerDAO{ 
	List<Customer> customers = new ArrayList<>();
	
	void addCustomer(Customer customer);
	
	void getCustomerByName(String name);
	
	void getAll();
}


public class ExempCustomerDAO implements CustomerDAO{
	
	@Override
	public void getCustomerByName(String name) {
		for (Customer c : customers) {
			if(c.getName() == name) {
				System.out.println("nome:"+c.getName()+" de ID:"+c.getUserId());
			}
		}
	}

	@Override
	public void getAll() {
		for (Customer c : customers) {
			System.out.println("nome:"+c.getName()+" de ID:"+c.getUserId());
		}
	}

	@Override
	public void addCustomer(Customer customer) {
		customers.add(customer);
		
	}

}

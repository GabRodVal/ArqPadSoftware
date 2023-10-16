
public class Client {
	private static ExempCustomerDAO exempCustDAO;
	
	public static void main(String[] args) {
		exempCustDAO = new ExempCustomerDAO();
		
		Customer c1 = new Customer("João");
		Customer c2 = new Customer("Carlos");
		Customer c3 = new Customer("Henrique");
		Customer c4 = new Customer("Matheus");
		Customer c5 = new Customer("João");
		
		exempCustDAO.addCustomer(c1);
		exempCustDAO.addCustomer(c2);
		exempCustDAO.addCustomer(c3);
		exempCustDAO.addCustomer(c4);
		exempCustDAO.addCustomer(c5);
		
		exempCustDAO.getAll();
		
		System.out.println("//");
		
		exempCustDAO.getCustomerByName("Matheus");
		exempCustDAO.getCustomerByName("João");
	}

}

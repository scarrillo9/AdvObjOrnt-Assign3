import java.util.Set;

public class Cart {
	Set<Item> list;
	Customer c;
	
	public Cart(String name, String username, String password, String address){
		Customer c = new Customer();
		c.setName(name);
		c.setUsername(username);
		c.setPassword(password);
		c.setHomeAddress(address);
	}
	
	//CART CONSTRUCTOR
	public void calculateCombinedPrice(){
		
	}//calculateCOmbinesPrice
	
	public void listItems(){
		list.iterator();
	}//end listItems
	
	public void printCustomer(){
		System.out.printf("Name: %s, Username: %s", c.getName(), c.getUsername());
	}//end printCustomer
	
	public void orderByPrice(){
		System.out.println("orderByPrice");
	}
	
}

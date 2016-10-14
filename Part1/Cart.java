import java.util.Set;

public class Cart {
	public Set<Item> list;
	public Customer c;
	
	public Cart(String name, String username, String password, String address){
		//Customer c = new Customer();
		this.c.setName(name);
		this.c.setUsername(username);
		this.c.setPassword(password);
		this.c.setHomeAddress(address);
	}
	
	//CART CONSTRUCTOR
	public void calculateCombinedPrice(){
		double count = 0;
		for(Item l : list)
			count += l.getPrice();
		System.out.println(count);
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

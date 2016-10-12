import java.util.Set;

public class Cart {
	Set<Item> list;
	Customer c;

	public Cart(){
		
	}
	
	//CART CONSTRUCTOR
	public void calculateCombinedPrice(){
		
	}//calculateCOmbinesPrice
	
	public void listItems(){
		list.iterator();
	}//end listItems
	
	public void printCustomer(){
		System.out.printf("Customer: %s \n%s", c.getName(),c.getUsername());
	}//end printCustomer
	
	public void orderByPrice(){
		System.out.println("orderByPrice");
	}
	
}

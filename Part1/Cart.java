import java.util.HashSet;
import java.util.Set;

//It is created by the customer
public class Cart {
	
	private Set<Item> list; //Keep private
	
	//Constructor
	public Cart(){
		//Creates a new Set of type items
		setList(new HashSet<Item>());
	}
	
	
	public void calculateCombinedPrice(){
		//TO-DO
	}
	
	/* printAll method does what the next method should (I think) 
	 * So we can have one that just prints what the titles or the 
	 * types and one that prints all the details*/
	public void listItems(){
		getList().iterator();
	}//end listItems
	
	// Print all items in the cart
	public void printAll() {
		int i = 0; // Display the number of the item
		for (Item it : getList()) {
			//GRACIAS STEFF por ensenarme el poder de printf jajaja :)
			System.out.printf("\nItem #%d is type %s. Title: %s, Price %.2f",i, it.itemType(), it.getTitle(), it.getPrice());
			i++;
		}
	}
	
	public void orderByPrice(){
		System.out.println("orderByPrice");
	}


	public Set<Item> getList() {
		return list;
	}


	public void setList(Set<Item> list) {
		this.list = list;
	}
	
}

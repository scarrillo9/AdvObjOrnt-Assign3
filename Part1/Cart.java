import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

//It is created by the customer
public class Cart {
	
	private Set<Item> list; //Keep private
	private String cName;
	private String cUsername;
	
	//Constructor
	public Cart(){
		//Creates a new Set of type items
		setList(new HashSet<Item>());
	}
	
	public void setCustomer(String name, String username){
		this.setcName(name);
		this.setcUsername(username);
	}
	
	public void printCustomer(){
		System.out.println("Customer: " + getcName() 
			+ " ID: " + getcUsername());
	}
	
	
	public void calculateCombinedPrice(){
		double price = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		for(Item l : getList()){
			price += l.getPrice();
		}
		System.out.print(df.format(price));
	}
	
	
	public void listItems(){
		getList().iterator();
	}//end listItems
	
	// Print all items in the cart
	public void printAll() {
		int i = 0; // Display the number of the item
		for (Item it : getList()) {
			System.out.printf("Item #%d is type %s. Title: %s, Price %.2f\n",
					i, it.itemType, it.getTitle(), it.getPrice());
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

	public String getcUsername() {
		return cUsername;
	}

	public void setcUsername(String cUsername) {
		this.cUsername = cUsername;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
}

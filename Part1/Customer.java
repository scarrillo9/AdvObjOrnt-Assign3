
import java.util.Scanner;
import java.util.Set;

public class Customer extends User{
	Scanner input = new Scanner(System.in);
	
	private String homeAddress;
	
	Set<CreditCard> cards;
	
	private Cart shoppingCart;
	
	public Customer(){
		System.out.println("Enter name:");
		setName(input.nextLine());
		System.out.println("Enter username:");
		setUsername(input.nextLine());
		System.out.println("Enter password:");
		setPassword(input.nextLine());
		System.out.println("Home address: ");
		this.homeAddress = input.nextLine();
		
		//Create a new Cart
		shoppingCart = new Cart();
		//TO-DO
		//Create a new Credit Card
		
	}//end constructor

	public void addToCart(Item t){
		shoppingCart.getList().add(t);
		System.out.println("addToCart: " +t.getTitle());
		
	}//end addToCart
	
	public void checkoutCart(){
		System.out.println("checkoutCart");
	}//end checkoutCart
	
	public void printAllCreditCards(){
		
	}//end printAllCreditCards
	
	/* Getters and setters */
	
	public Cart getCart(){
		return shoppingCart;
	}

	public String getHomeAddress() {
		return homeAddress;
	}


	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	
	

}

	

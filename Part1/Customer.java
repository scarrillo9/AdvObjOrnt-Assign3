import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Customer extends User{
	Scanner input = new Scanner(System.in);
	private String homeAddress;
	Set<CreditCard> cards;
	Cart shoppingCart;
	
	public Customer(){
		System.out.println("Enter name:");
		setName(input.nextLine());
		System.out.println("Enter username:");
		setUsername(input.nextLine());
		System.out.println("Enter password:");
		setPassword(input.nextLine());
		System.out.println("Home address: ");
		this.homeAddress = input.nextLine();
		
		this.shoppingCart = new Cart(getName(), getUsername(), 
				getPassword(), getHomeAddress());	
				
		Set<CreditCard> creditcards = new HashSet<CreditCard>();
		CreditCard card = new CreditCard();
		creditcards.add(card);
		
	}
	
	public void addToCart(Item t){
		System.out.println("addToCart");
	}//end addToCart
	
	public void checkoutCart(){
		System.out.println("checkoutCart");
	}//end checkoutCart
	
	public void printAllCreditCards(){
		
	}//end printAllCreditCards
	
	//GETTER//
	public String getHomeAddress(){
		return homeAddress;
	}
	
	//SETTER//
	public void setHomeAddress(String homeAddress){
		this.homeAddress = homeAddress;
	}

}

	

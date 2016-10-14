
import java.util.HashSet;
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
		shoppingCart.setCustomer(getName(), getUsername());
		//TO-DO
		//Create a new Credit Card
		this.cards = creditCardList();
		//cards.add(new CreditCard());
		CreditCard cc = new CreditCard();
		cards.add(cc);
		
	}//end constructor
	
	public Set<CreditCard> creditCardList(){
		return (new HashSet<CreditCard>());
	}//constructor
	
	public void listCreditCards(){
		int i = 1;
		for(CreditCard l : cards){
			System.out.println("Card " + i + ": " + l.getNumber());
			i++;
		}
	}

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

	

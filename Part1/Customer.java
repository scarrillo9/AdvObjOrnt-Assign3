import java.util.Scanner;
import java.util.Set;

public class Customer extends User{
	Scanner input = new Scanner(System.in);
	private String homeAddress;
	Set<CreditCard> cards;
	Cart shoppingCart;
	
	public Customer(String name, String username, String password){
		setName(name);
		setUsername(username);
		setPassword(password);
		
		System.out.println("Home address: ");
		this.homeAddress = input.nextLine();
		
		cards.add(new CreditCard());
		
		this.shoppingCart = new Cart();
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

	


public class Customer extends User{
	private String homeAddress;
	CreditCard[] cards;
	Cart shoppingCart;
	
	public void addToCart(Item t){
		System.out.println("addToCart");
	}//end addToCart
	
	public void checkoutCart(){
		System.out.println("checkoutCart");
	}//end checkoutCart
	
	public void printAllCreditCards(){
		for(int i = 0; i < cards.length; i++){
			System.out.println("Card #" + (i+1) + cards[i].getNumber());
		}//end for
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

	

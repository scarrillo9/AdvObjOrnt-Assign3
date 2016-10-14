import java.util.Scanner;

public class Item {
	private String title;
	private double price;
	public Cart shoppingCart;
	Scanner input = new Scanner(System.in);
	
	public void itemType(){
	}//end printItemType
	
	//GETTER METHODS//
	public String getTitle(){
		return title;
	}
	
	public double getPrice(){
		return price;
	}
	
	//SETTEER METHODS//
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setPrice(double price){
		this.price = price;
	}	
}

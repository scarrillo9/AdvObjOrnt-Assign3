
public class Item {
	private String title;
	private double price;
	
	protected String itemType; //Protected so the inherited classes can have access to it
	
	
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

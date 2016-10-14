
public class Book extends Item{
	
	//Constructor
	public Book(String title, double price){
		this.setTitle(title);
		this.setPrice(price);
		this.itemType = "book"; //Type book
	}


	public void showPreview(){
		System.out.println("showPreview");
	}//end show preview
	
	
}//end class

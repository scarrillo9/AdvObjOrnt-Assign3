
public class Book extends Item{
	
	public Book(Cart cart){
		this.shoppingCart = cart;
		System.out.println("Book title: ");
		setTitle(input.nextLine());
		System.out.println("Book price: ");
		setPrice(input.nextDouble());
	}
	
	public void showPreview(){
		System.out.println("showPreview");
	}//end show preview
	
	public void itemType(){
		System.out.println("Book");
	}
	
	
}

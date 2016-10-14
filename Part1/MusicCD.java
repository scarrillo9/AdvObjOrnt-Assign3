
public class MusicCD extends Item{
	
	public MusicCD(Cart cart){
		this.shoppingCart = cart;
		System.out.println("Book title: ");
		setTitle(input.nextLine());
		System.out.println("Book price: ");
		setPrice(input.nextDouble());
	}
	
	public void playSample(){
		System.out.println("playSample");
	}
	
	public void itemType(){
		System.out.println("Music CD");
	}
	
}

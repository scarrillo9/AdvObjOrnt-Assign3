
public class ComputerSoftware extends Item{
	
	public ComputerSoftware(Cart cart){
		this.shoppingCart = cart;
		System.out.println("Software title: ");
		setTitle(input.nextLine());
		System.out.println("Software price: ");
		setPrice(input.nextDouble());
	}
	
	public void itemType(){
		System.out.println("Computer Software");
	}

}

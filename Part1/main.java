
public class main {
	public static void main(String[] args){
		//Create a customer
		Customer customer = new Customer();
		
		//Create some book items
		Item harryPotterBook = new Book("Secret of Chambers", 29.99);
		Item elPistoleroBook = new Book("El Pistolero", 19.99);
		Item principitoBook = new Book("El principito", 9.99);
		
		//Add items  to cart
		System.out.println("Adding some books...");
		customer.addToCart(harryPotterBook);
		customer.addToCart(elPistoleroBook);
		customer.addToCart(principitoBook);
		System.out.println("Adding some music...");
		customer.addToCart(new MusicCD("Random Access Memories", 3.50));
		customer.addToCart(new MusicCD("Californication", 2.15));
		customer.addToCart(new MusicCD("Subliminal Verses 3.0", 3.99));
		
		//Print all car items
		System.out.println("\nGet Shopping cart items: ");
		customer.getCart().printAll();
		
		
	}//end main
}//end main class

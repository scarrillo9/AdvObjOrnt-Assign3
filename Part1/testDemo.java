
public class testDemo {
	public static void main(String[] args){
		//Create a customer
		System.out.println("Create customer: ");
		Customer customer = new Customer();
		System.out.println("Customer created\n");
		//Create a manager
		System.out.println("Create manager: ");
		Manager manager = new Manager();
		System.out.printf("Manager created\n ID: %s\n\n", 
				manager.getEmployeeID());
		
		//Create some book items
		Item harryPotterBook = new Book("Secret of Chambers", 29.99);
		Item elPistoleroBook = new Book("El Pistolero", 19.99);
		
		
		//Add items  to cart
		System.out.println("\nAdding some books...");
		customer.addToCart(harryPotterBook);
		customer.addToCart(elPistoleroBook);
		
		
		System.out.println("\nAdding some music...");
		customer.addToCart(new MusicCD("Don't Touch My Hair", 3.50));
		customer.addToCart(new MusicCD("Californication", 2.15));
		
		
		System.out.println("\nAdding some software...");
		customer.addToCart(new ComputerSoftware("Github Desktop", 1.99));
		customer.addToCart(new ComputerSoftware("Pokemon TCG", 3.99));
		
		
		//adding new card
		System.out.println("\n\nAdding new card...");
		CreditCard card = new CreditCard();
		customer.cards.add(card);
		
		
		//printing cards
		System.out.println("\n\nPrinting card numbers...");
		customer.listCreditCards();
		
		//Print all car items
		System.out.println("\n\nPrinting cart items: ");
		customer.getCart().printAll();
		System.out.println();
		
		
		System.out.println("\nPrinting total amount of cart...");
		System.out.println("Total: ");
		customer.getCart().calculateCombinedPrice();
		
		
		System.out.println("\n\nPrinting item types...");
		for(Item i : customer.getCart().getList())
			System.out.printf("%s is of item type %s\n", 
					i.getTitle(), i.itemType);
		
		
		System.out.println("\n\nWhat customer does this cart belong to: ");
		customer.getCart().printCustomer();
		
		
	}//end main
}//end main class

import java.util.Scanner;

public class Manager extends User{
	private String employeeID;
	Scanner input = new Scanner(System.in);
	
	public String getEmployeeID(){
		return employeeID;
	}//SETTER//
	
	public void setEmployeeID(String employeeID){
		this.employeeID = employeeID;
	}//GETTER//
	
	public void createItem(){
		try{
			System.out.println("Are you creating a book, CD, or software item?\n"
					+ "(type 'b' for book, 'c' for CD, or 's' for software)");
			String userInput = input.next();
			if(userInput.equals("b"))
				createBook();
			if(userInput.equals("c"))
				createCD();
			if(userInput.equals("s"))
				createSoftware();
		} catch(Exception e){
			System.out.println("Please enter a valid letter.");
				}//end try/catch
	}//createItem
	
	public void createBook(){
		System.out.println("You're creating a book.");
		Book b = new Book();
		System.out.println("Enter title of book: ");
		b.setTitle(input.next());
		System.out.println("Enter price of book: ");
		b.setPrice(input.nextDouble());
		System.out.printf("Book created: %s %d", b.getTitle(), b.getPrice());
	}//end createItem
	
	public void createCD(){
		System.out.println("You're creating a CD.");
		MusicCD b = new MusicCD();
		System.out.println("Enter title of CD: ");
		b.setTitle(input.next());
		System.out.println("Enter price of CD: ");
		b.setPrice(input.nextDouble());
		System.out.printf("CD created: %s %d", b.getTitle(), b.getPrice());
	}//end createItem
	
	public void createSoftware(){
		System.out.println("You're creating a software.");
		ComputerSoftware b = new ComputerSoftware();
		System.out.println("Enter title of software: ");
		b.setTitle(input.next());
		System.out.println("Enter price of software: ");
		b.setPrice(input.nextDouble());
		System.out.printf("Software created: %s %d", b.getTitle(), b.getPrice());
	}//end createItem
	
	public void updateItem(Item t){
		System.out.println("You're updating an item.");
		System.out.println("Enter new item name: ");
		t.setTitle(input.next());
		System.out.println("Enter new item price: ");
		t.setPrice(input.nextDouble());
		System.out.printf("Item updated: %s %d", t.getTitle(), t.getPrice());
	}//end updateItem
	
	public void createCustomer(){
		System.out.println("You're creating a customer.");
		Customer c = new Customer();
		System.out.println("Enter name: ");
		c.setName(input.next());
		System.out.println("Enter username: ");
		c.setUsername(input.next());
		System.out.println("Enter password: ");
		c.setPassword(input.next());
		System.out.println("Enter home address: ");
		c.setHomeAddress(input.next());
		System.out.printf("Customer created: %s %s %s %s", c.getName(), 
				c.getUsername(), c.getPassword(), c.getHomeAddress());
	}//end createCustomer
	
	public void updateCustomer(Customer c){
		System.out.println("You're updating a customer.");
		System.out.println("Enter new name: ");
		c.setName(input.next());
		System.out.println("Enter new username: ");
		c.setUsername(input.next());
		System.out.println("Enter new password: ");
		c.setPassword(input.next());
		System.out.println("Enter new home address: ");
		c.setHomeAddress(input.next());
		System.out.printf("Customer updated: %s %s %s %s", c.getName(), 
				c.getUsername(), c.getPassword(), c.getHomeAddress());
	}//end updateCustomer
	
	public void deleteItem(Item t){
		
		
	}//end deleteItem
	
	public void deleteCustomer(Customer c){
		
		
	}//end deleteCustomer

	 
}

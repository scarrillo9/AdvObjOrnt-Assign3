public class Manager extends User{
	private String employeeID;
	
	public String getEmployeeID(){
		return employeeID;
	}//SETTER//
	
	public void setEmployeeID(String employeeID){
		this.employeeID = employeeID;
	}//GETTER//
	
	public void createItem(){
		System.out.println("createItem");
//		try{
//			System.out.println("Are you creating a book, CD, or software item?\n"
//					+ "(type 'b' for book, 'c' for CD, or 's' for software)");
//			String userInput = input.next();
//			if(userInput.equals("b"))
//				createBook();
//			if(userInput.equals("c"))
//				createCD();
//			if(userInput.equals("s"))
//				createSoftware();
//		} catch(Exception e){
//			System.out.println("Please enter a valid letter.");
//				}//end try/catch
	}//createItem
	
	public void updateItem(Item t){
		System.out.println("updateItem");
//		System.out.println("Enter new item name: ");
//		t.setTitle(input.next());
//		System.out.println("Enter new item price: ");
//		t.setPrice(input.nextDouble());
//		System.out.printf("Item updated: %s %d", t.getTitle(), t.getPrice());
	}//end updateItem
	
//	public void createCustomer(){
//		System.out.println("createCustomer");
//		Customer c = new Customer();
//		System.out.println("Enter name: ");
//		c.setName(input.nextLine());
//		System.out.println("Enter username: ");
//		c.setUsername(input.nextLine());
//		System.out.println("Enter password: ");
//		c.setPassword(input.nextLine());
//		System.out.println("Enter home address: ");
//		c.setHomeAddress(input.nextLine());
//		System.out.printf("Customer created: %s %s %s %s", c.getName(), 
//				c.getUsername(), c.getPassword(), c.getHomeAddress());
//		System.out.println("Enter credit card information\nCard number:");		
//	}//end createCustomer
	
	public void updateCustomer(Customer c){
		System.out.println("updateCustomer");
//		System.out.println("Enter new name: ");
//		c.setName(input.next());
//		System.out.println("Enter new username: ");
//		c.setUsername(input.next());
//		System.out.println("Enter new password: ");
//		c.setPassword(input.next());
//		System.out.println("Enter new home address: ");
//		c.setHomeAddress(input.next());
//		System.out.printf("Customer updated: %s %s %s %s", c.getName(), 
//				c.getUsername(), c.getPassword(), c.getHomeAddress());
	}//end updateCustomer
	
	public void deleteItem(Item t){
		System.out.println("deleteItem");
	}//end deleteItem
	
	public void deleteCustomer(Customer c){
		System.out.println("deleteCustomer");
	}//end deleteCustomer

	 
}

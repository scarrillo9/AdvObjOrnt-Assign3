import java.util.Scanner;

public class User {
	private String name;
	private String username;
	private String password;
	
	public Customer createCustomer(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name:");
		String cname = input.nextLine();
		System.out.println("Enter username:");
		String cusername = input.nextLine();
		System.out.println("Enter password:");
		String cpassword = input.nextLine();
		Customer c = new Customer(cname, cusername, cpassword);
		return c;
	}
	
	public void browseItem(){
		System.out.println("Browse items.");
	}//end browse item
	
	public void register(){
		System.out.println("Register");
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter name:");
//		this.name = input.next();
//		System.out.println("Enter username:");
//		this.username = input.next();
//		System.out.println("Enter password:");
//		this.password = input.next();
	}//end register
	
	
	//GETTER METHODS//
	public String getName(){
		return name;
	}
	
	public String getUsername(){
		return username;
	}

	public String getPassword(){
		return password;
	}
	
	//SETTER METHODS//
	public void setName(String name){
		this.name = name;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
}

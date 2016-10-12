import java.util.Scanner;

public class CreditCard {
	private int number;
	private String expirationDate;
	private int CVS;
	
	public CreditCard(){
		Scanner input = new Scanner(System.in);
		System.out.println("Card number: ");
		this.number = input.nextInt();
		System.out.println("Card expiration date: ");
		this.expirationDate = input.nextLine();
		System.out.println("Card CVS: ");
		this.CVS = input.nextInt();
	}
	
	
	//GETTER METHODS//
	public int getNumber(){
		return number;
	}
	
	public String getExpDate(){
		return expirationDate;
	}
	
	public int getCVS(){
		return CVS;
	}
	
	//SETTER METHODS//
	public void setNumber(int number){
		this.number = number;
	}
	
	public void setExpDate(String expirationDate){
		this.expirationDate = expirationDate;
	}
	
	public void setCVS(int CVS){
		this.CVS = CVS;
	}
}

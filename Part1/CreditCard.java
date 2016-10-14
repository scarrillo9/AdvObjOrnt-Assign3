import java.util.Scanner;

public class CreditCard {
	private long number;
	private String expirationDate;
	private int CVS;
	
	public CreditCard(){
		Scanner input = new Scanner(System.in);
		System.out.println("Card number: ");
		this.number = input.nextLong();
		System.out.println("Card expiration date: ");
		this.expirationDate = input.next();
		System.out.println("Card CVS: ");
		this.CVS = input.nextInt();
	}//constructor
	
	
	//GETTER METHODS//
	public long getNumber(){
		return number;
	}
	
	public String getExpDate(){
		return expirationDate;
	}
	
	public int getCVS(){
		return CVS;
	}
	
	//SETTER METHODS//
	public void setNumber(long number){
		this.number = number;
	}
	
	public void setExpDate(String expirationDate){
		this.expirationDate = expirationDate;
	}
	
	public void setCVS(int CVS){
		this.CVS = CVS;
	}
	
//	public Set<CreditCard> setList(Set<CreditCard> list) {
//		this.list = list;
//	}
}

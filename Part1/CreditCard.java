
public class CreditCard {
	private int number;
	private String expirationDate;
	private int CVS;
	
	
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

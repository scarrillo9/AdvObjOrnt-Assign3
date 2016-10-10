
public class Cart {
	Item[] list;

	public void calculateCombinedPrice(){
		//implement
	}
	
	public void listItems(){
		for(int i = 0; i < list.length; i++){
			System.out.println("Item #" + (i+1) + list[i].getTitle());
		}//end for
	}//end listItems
	
	public void printCustomer(){
		//implement
	}
	
	public void orderByPrice(){
		System.out.println("orderByPrice");
	}
	
}

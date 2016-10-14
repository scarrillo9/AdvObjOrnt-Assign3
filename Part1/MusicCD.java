
public class MusicCD extends Item {

	// Constructor
	public MusicCD(String title, double price) {
		this.setTitle(title);
		this.setPrice(price);
		this.itemType = "MusicCD";
	}

	public void showPreview() {
		System.out.println("showPreview");
	}// end show preview

}

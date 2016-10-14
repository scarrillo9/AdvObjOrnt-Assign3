
public class MusicCD extends Item {

	// Constructor
	public MusicCD(String title, double price) {
		this.setTitle(title);
		this.setPrice(price);
		this.itemType = "Music CD";
	}

	public void showPreview() {
		System.out.println("showPreview");
	}// end show preview

}

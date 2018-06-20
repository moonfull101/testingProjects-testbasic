package author;

public class Book extends Author {
	
	private String name; 
	private Author author; 
	private double price;
	private int quantity; 
	
	public Book (String name, Author author, double price) {
		this.name = name; 
		this.author = author; 
		this.price = price; 
	}
	
	public Book (String name, Author author, double price, int quantity) {
		this.name = name; 
		this.author = author; 
		this.price = price; 
		this.quantity = quantity; 
	}
	public String getName () {
		return name; 
	}
		public Author getAuthor() {
			return author; 
		}
		public double getPrice () {
			return price; 
		}
		public void setPrice (double newPrice) {
			this.price = newPrice; 
		}
		public int getQty () {
			return quantity; 
		}
		public void setQty (int newQuantity) {
			this.quantity = newQuantity;
		}
		public String toString () {
			return "Book[name = " + name + "Author[name= " + name + "email = " + email + "gender + " + gender +"], price = "+ price + "quantity = "+ quantity; 
		}
}





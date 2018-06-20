package author;

public class Book extends Author {
	
	private String nameOfABook; 
	private Author author; 
	private double price;
	private int quantity; 
	private String NameAuthor; 
	
	public Book (String name, Author author, double price) {
		this.nameOfABook = name; 
		this.author = author; 
		this.price = price; 
	}
	
	public Book (String name, Author author, double price, int quantity) {
		this.nameOfABook = name; 
		this.author = author; 
		this.price = price; 
		this.quantity = quantity; 
	}
	public String getNameOfABook (String nameOfABook) {
		return nameOfABook; 
	}
		public Author getAuthor(Author author) {
			return author; 
		
		}
		public double getPrice (double price) {
			return price; 
		}
		public void setPrice (double newPrice) {
			this.price = newPrice; 
		}
		public int getQty (int quantity) {
			return quantity; 
		}
		public void setQty (int newQuantity) {
			this.quantity = newQuantity;
		}
		public String toString () {
			return "Book[name = " + nameOfABook + " Author[name= " + nameOfABook + " email = " + email + " gender + " + gender +"], price = "+ price + " quantity = "+ quantity; 
		}

		public String getAuthor(String name) {
			return name;
		}

		public void setAuthorName(String nameAuthor) {
			// TODO Auto-generated method stub
			this.NameAuthor = nameAuthor;
		}
		
			public String getAuthorName (String nameAuthornow) {
				return nameAuthornow; 
			}
		}







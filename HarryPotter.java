package author;

public class HarryPotter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a new author with author instances
		Author jkRowling = new Author ("j.k.rowling", "j.k.rowing@harrypotter.com ", 'f'); 
		//email has to be set since it is a setter. 
		jkRowling.setEmail("j.k.rowling@harrypotter.com");
		//test printing Author's toString
		System.out.println(jkRowling);
		
		//create a new book using book's values
		Book HarryPotter1 = new Book("harry potter and the philo's stone", jkRowling, 60.50, 20); 
		HarryPotter1.setEmail("j.k.rowling@harrypotter.com");
		System.out.println(HarryPotter1);
		
		HarryPotter1.setPrice(60.50);
		HarryPotter1.setQty(20);
		HarryPotter1.getAuthorName("JKROWLING");
		System.out.println("The name is: " + HarryPotter1.getNameOfABook("harry potter 1")); 
		System.out.println("the price is: " + HarryPotter1.getPrice(60));
		System.out.println("the quantity is: "+ HarryPotter1.getQty(9));
		System.out.println(HarryPotter1.getAuthor(jkRowling));
		System.out.println("the author is: " + HarryPotter1.getAuthor(jkRowling));
		System.out.println("the author's email is: " + HarryPotter1.getAuthor(jkRowling.getEmail()));
		
			Author [] authors = new Author [2];
		authors[0] = new Author ("j.k.rowling", "j.k.rowlingoriginal@test.com", 'm'); 
		authors[1] = new Author ("Carry-j.k.rowling daughter ", "daughterof@test.com", 'f'); 


	}

}

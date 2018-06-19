package authroPractice;

public class Author {

	public String name; 
	public String email; 
	public char gender; 
	
	public Author() {
		name = "author";
		email = "email";
		gender = 'f'; 		
	}
	
	public Author(String name, String email, char gender) {
		this.name = name; 
		this.gender = gender; 
	}

	public String getName() {
		return name; 
		
	}
	
	public String getEmail() {
		return email; 
	}
	
	public void setEmail(String newEmail) {
		email =  newEmail;
	}
	public char getGender() {
		return gender; 
	}
	
	public String toString() {
		
		return "Author[name= " + name + "email = " + email + "gender + " + gender +"]"; 
	}



} 

package authroPractice;

public class Authortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Author shelly = new Author ("Shelly", "shelly@test.com", 'f'); //test basic constructor
		System.out.println(shelly);
		
			
			
			
			
		shelly.setEmail("shelly@tiku.com");
		System.out.println("the name is:" + shelly.getName());
		System.out.println("the email is:" + shelly.getEmail());
		System.out.println("the gender is:" + shelly.getGender());
		
		
		
	}

}

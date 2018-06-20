package circle;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Declare an instance of Circle class called c1.
	      // Construct the instance c1 by invoking the "default" constructor
	      // which sets its radius and color to their default value.
		Circle c1 = new Circle(5.0); 
		// Invoke public methods on instance c1, via dot operator.
		System.out.println("the circle has a radois of "+ c1.getRadius() + " and an area of " + c1.GetArea());
		
		System.out.println(c1.toString());   // explicit call
		
		// Declare an instance of class circle called c2.
	      // Construct the instance c2 by invoking the second constructor
	      // with the given radius and default color.
		
		Circle c2 = new Circle(1.2); 
		// Invoke public methods on instance c2, via dot operator.
		System.out.println("the circle has a radois of "+ c2.getRadius() + " and an area of " + c2.GetArea());
		System.out.println(c2.toString());  // explicit call
		System.out.println(c2);             // println() calls toString() implicitly, same as above
		System.out.println("Operator '+' invokes toString() too: " + c2);  // '+' invokes toString() too
		
		Circle c4 = new Circle();   // construct an instance of Circle
		c4.setRadius(5.0);          // change radius
		System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
		c4.setColor("blue");        // Change color
		System.out.println("color is: " + c4.getColor());   // Print color via getter
}

}
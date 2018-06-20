package circle;

public class Circle {
	// private instance, not accessible from outside of this class
	private double radius; 
	private String color; 
	
	// The default constructor with no argument.
	   // It sets the radius and color to their default value.
	
	//all constructors were changed to "this.... = instance value" 
	public Circle() {
		radius = 1.0; 
		color = "red"; 
	}
	
	 // 2nd constructor with given radius, but color default
	public Circle (double r) {
		this.radius = r; 
		this.color = "red"; 
		
	}
	// 3rd constructor to construct a new instance of Circle with the given radius and color
	public Circle (double r, String c) {
		this.radius = r; 
		this.color = c; 
	}
	
	/*
	 * public Circle (Double radius, radius) {
	 * this.radois = radius; 
	 * }
	 * ==
	 * 
	 * public Circle (Double r) {
	 *  radius = r; 
	 * }
	 * 
	 */
	
	// Setter for instance variable radius
	public void setRadius (double newRadius) {
		this.radius = newRadius;
	}
	
	// Setter for instance variable color
	public void setColor (String newColor) {
		this.color = newColor;
	}
	
	// Getter for instance variable color
	public String getColor() {
		return color; 
	}
	
	//a public method for getting the radius
 public double getRadius () {
	 return radius; 
 }
 
//A public method for computing the area of circle
 public double GetArea () {
	 return radius*radius*Math.PI;
 }
 
//Return a description of this instance in the form of
//Circle[radius=r,color=c]
public String toString() {
 return "Circle[radius=" + radius + " color=" + color + "]";
}

}






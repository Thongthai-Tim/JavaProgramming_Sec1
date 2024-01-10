
public class TestCircle {
	
	public static void main(String[] args) {
		//declare an object reference Class Circle
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		//assign radius to object c1 and display radius,area
		c1.radius = 12.5;
		System.out.println("Radius of object c1 = "+c1.getRadius());
		System.out.println("Radius of object c1 = "+c1.getArea());
		System.out.println();
		c2.radius = 5.5;
		System.out.println("Radius of objet c2 = "+c2.getRadius());
		System.out.println("Area of objet c2 = "+c2.getArea());
	}
	public static String showColor(String color) {
		return "THe color is " + color;
	}
}

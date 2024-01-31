
public class Rectangle extends Shape{

	private double width, length;
	
	Rectangle(double width, double length, String color){
		super(color); //call attribute color from Constructor method Class Shape
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getlength() {
		return length;
	}
	
	@Override
	public double getArea() {//implement getArea()method from abstract class Shape
		return this.width*this.length;
	}
	
	@Override
	public String toString() {
		return "Rectangle[width = "+this.width+",length = "+this.length+","+super.toString()+"]";
	}
}

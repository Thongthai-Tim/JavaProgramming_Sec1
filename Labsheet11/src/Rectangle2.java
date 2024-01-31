
public class Rectangle2 implements Shape2 {
private double width, length;
	
	Rectangle2(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getlength() {
		return length;
	}
	
	public double getArea() {
		return this.width*this.length;
	}
	
	public String toString() {
		return "Rectangle[width = "+this.width+",length = "+this.length+"]";
	}}

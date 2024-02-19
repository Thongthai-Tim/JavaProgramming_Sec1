
public abstract class Shape {
	private String  color;
	
	Shape(String color){
		this.color = color;
	}
	Shape(){
		this.color = null;
	}
	
	public abstract double getArea();
	
	public String toString() {
		return "color = " + color;
	}
}

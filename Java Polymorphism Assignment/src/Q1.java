class Shape{
	String color;
	Shape(String color){
		this.color = color;
	}
	
	@SuppressWarnings("null")
	public double getArea() {
		return (Double) null;
	}
	
	public String toString() {
		return "The color of the object is "+this.color;
	}
}

class Rectangle extends Shape{
	int length;
	int width;
	
	Rectangle(String color, int length, int width){
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		
		return length * width;
	}
	
	public String toString() {
		return "The color of the Rectangle is "+this.color+" and has an area of "+this.getArea();
	}
}

class Triangle extends Shape{
	int base;
	int height;
	
	Triangle(String color, int base, int height){
		super(color);
		this.base = base;
		this.height = height;
	}
	
public double getArea() {
		
		return (base * height)/2;
	}

public String toString() {
	return "The color of the Triangle is "+this.color+" and has an area of "+this.getArea();
}
	
}


public class Q1 {

	public static void main(String[] args) {
		
		Shape a;
		a = new Rectangle("blue",6,7);
		System.out.println(a.toString());
		
		a = new Triangle("Yellow", 8, 12);
		System.out.println(a.toString());
		

	}

}

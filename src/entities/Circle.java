package entities;

public class Circle extends Shape implements Printable {

	public Circle(int radius, Point center) {
		this.radius = radius;
		this.center = center;
	}

	public Circle(int radius, Point center, String color) {
		this(radius, center);
		this.color = color;
	}

	private int radius;
	private Point center;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void print() {
		System.out.println("A cicle at (" + this.center + ") of radius " + this.radius + " is being printed");

	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {

		return super.toString()+ " Circle center (" + this.center + ") of radius :" + this.radius ;
	}

}

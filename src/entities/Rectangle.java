package entities;

public class Rectangle extends Shape implements Printable {
	
	public Rectangle(Point topLeft, int length,int width){
		this.topLeft = topLeft;
		this.length = length;
		this.width = width;
	}
	
	public Rectangle(Point topLeft, int length,int width,String color){
		this(topLeft,length,width);
		this.color = color;
	}
	
	public Rectangle(){
		
	}
	
	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	private Point topLeft;
	private int length;
	private int width;

	@Override
	public void print() {
		System.out.println("I' a rectangle");
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public String toString() {
		return super.toString() + " Rectangle top left at (" + this.topLeft + ") of length :" + this.length+" and width :"+this.width;
	}
}

package entities;

public class Square extends Shape implements Printable {

	public Square(Point topLeft, int length) {
		this.topLeft = topLeft;
		this.length = length;
	}
	
	public Square(Point topLeft, int length,String color) {
		this.topLeft = topLeft;
		this.length = length;
		this.color = color;
	}

	public Square() {

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

	private Point topLeft;
	private int length;

	@Override
	public void print() {
		System.out.println("A square at (" + this.topLeft.getX() + "," + this.topLeft.getY() + ") of length "
				+ this.length + " is being printed");
	}

	@Override
	public double getArea() {
		return length * length;
	}

	@Override
	public String toString() {
		return super.toString() + " Square top left at (" + this.topLeft + ") of length :" + this.length;
	}
}

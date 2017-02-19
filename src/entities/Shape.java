package entities;

public abstract class Shape {
	//made protected so that subclasses can use this.color notation
	protected String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//made abstract so that each subclass will be forced to implement its version
	public abstract double getArea();

	@Override
	public String toString() {
		return this.getColor();
	}

}

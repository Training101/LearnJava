package learncollections;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Point;
import entities.Rectangle;
import entities.Shape;
import entities.Square;

public class RunMe2 {

	//calculate the area of a list of shapes use arrays
	public static void main(String[] args) {
		Shape[] shapes = new Shape[6];
		shapes[0] = new Rectangle(new Point(1, 1), 3, 6);
		shapes[1] = new Square(new Point(2, 4), 4);
		shapes[2] = new Circle(20, new Point(1, 2));
		shapes[3] = new Circle(20, new Point(1, 2));
		shapes[4] = new Circle(20, new Point(1, 2));
		shapes[5] = new Circle(20, new Point(1, 2));
		System.out.println(sumOfArea(shapes));
	}

	//gets the sum of a list of shapes
	public static double sumOfArea(List<Shape> shapes) {
		double sum = 0;
		for (int i = 0; i < shapes.size(); i++) {
			sum = sum+shapes.get(i).getArea();
		}
		return sum;

	}
	
	// gets the sum of an Array of shapes
	public static double sumOfArea(Shape[] shapes) {
		double sum = 0;
		for (int i = 0; i < shapes.length; i++) {
			sum = sum+shapes[i].getArea();
		}
		return sum;

	}
		

}

package learncollections;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Point;
import entities.Rectangle;
import entities.Shape;
import entities.Square;

public class RunMe3 {

	//calculate sup of area using list
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Rectangle(new Point(1, 1), 3, 6));
		shapes.add(new Square(new Point(2, 4), 4));
		shapes.add(new Circle(20, new Point(1, 2)));
		shapes.add(new Circle(20, new Point(1, 2)));
		shapes.add(new Circle(20, new Point(1, 2)));
		shapes.add(new Circle(20, new Point(1, 2)));
		System.out.println(sumOfArea(shapes));
	}


	public static double sumOfArea(List<Shape> shapes) {
		double sum = 0;
		for (int i = 0; i < shapes.size(); i++) {
			sum = sum+shapes.get(i).getArea();
		}
		return sum;

	}
	// gets the sum of a list of shapes
	public static double sumOfArea(Shape[] shapes) {
		double sum = 0;
		for (int i = 0; i < shapes.length; i++) {
			sum = sum+shapes[i].getArea();
		}
		return sum;

	}
		

}

package learncollections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import entities.Circle;
import entities.Point;
import entities.Rectangle;
import entities.Shape;
import entities.Square;

public class RunMe4 {

	public static void main(String[] args) {

		//print how many shapes of each color are present
		List<Shape> shapes = new ArrayList<Shape>();

		shapes.add(new Rectangle(new Point(1, 1), 3, 6, "red"));
		shapes.add(new Square(new Point(2, 4), 4, "red"));
		shapes.add(new Circle(20, new Point(1, 2), "red"));
		shapes.add(new Circle(20, new Point(1, 2), "green"));
		shapes.add(new Circle(20, new Point(1, 2), "violet"));
		shapes.add(new Circle(20, new Point(1, 2), "green"));
		shapes.add(new Circle(20, new Point(1, 2), "blue"));
		printCountOfColorsOfShapes(shapes);
	}

	public static void printCountOfColorsOfShapes(List<Shape> shapes) {
		HashMap<String, Integer> countOfColors = new HashMap<String, Integer>();

		for (int i = 0; i < shapes.size(); i++) {
			String currentColor = shapes.get(i).getColor();
			if (countOfColors.get(currentColor) == null) {
				countOfColors.put(currentColor, 1);
			} else {
				countOfColors.put(currentColor, countOfColors.get(currentColor) + 1);
			}
		}
		System.out.println(countOfColors);

	}

	public static HashMap<String, ArrayList<Shape>> categorize(List<Shape> shapes) {
		int sum = 0;
		HashMap<String, ArrayList<Shape>> countOfColors = new HashMap<String, ArrayList<Shape>>();

		for (int i = 0; i < shapes.size(); i++) {
			String currentColor = shapes.get(i).getColor();
			if (countOfColors.get(currentColor) == null) {
				countOfColors.put(currentColor, new ArrayList<Shape>());
			}
			countOfColors.get(currentColor).add(shapes.get(i));
		}
		return countOfColors;

	}

}

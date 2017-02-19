package learncollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import entities.Point;
import entities.Shape;
import entities.Square;

public class RunMe {

	public static void main(String[] args) {
		
		//add shapes to an arrayList
		HashMap<String, Shape> shapesByColor= new HashMap<String, Shape>();
		shapesByColor.put("red", new Square(new Point(2, 4), 4));
		shapesByColor.put("blue", new Square(new Point(2, 4), 3));
		shapesByColor.put("green", new Square(new Point(2, 4), 2));
		shapesByColor.put(null, new Square(new Point(2, 4), 2));
		System.out.println(shapesByColor.get("red").getArea());

		

	}

}

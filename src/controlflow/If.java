package controlflow;

public class If {
	public static void main(String[] args) {
		// check marks and print grade
		String grade = "";
		int marks = 85;
		if (marks > 90) {
			grade = "A";
		} else if (marks > 70) {
			grade = "B";
		} else if (marks > 60) {
			grade = "C";
		} else if (marks > 50) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);
	}
}

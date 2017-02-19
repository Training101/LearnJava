package controlflow;

public class For {
	public static void main(String[] args) {

		// for loop printing in order
		int arr2[] = { 1, 4, 6, 3, 2, 7 };

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		// for loop printing in reverse order
		System.out.println("---for loop printing in reverse order------");
		for (int i = arr2.length - 1; i >= 0; i--) {
			System.out.println(arr2[i]);
		}
	}
}

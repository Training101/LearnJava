package controlflow;

public class While {
	public static void main(String[] args) {
		//While loop printing array elements in order
		int arr[] = { 1, 4, 6, 3, 2, 7 };
		int i = 0;
		while ( i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		
		System.out.println("reverse order ");
		
		//While loop printing array elements in reverse order
		int j = arr.length-1;
		while ( j >=0) {
			System.out.println(arr[j]);
			j--;
		}

	}

}

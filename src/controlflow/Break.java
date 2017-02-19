package controlflow;

public class Break {
	public static void main(String[] args) {

		//break statment stops execution and moves the next line after the loop
		
		int arr[] = { 1, 4, 6, 3, 2, 7 };
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
			if(arr[i]>5){
				System.out.println("found a number larger than 5 : " +arr[i]);
				break;
			}
			
			System.out.println("More processing ");
			
		}
	}

}

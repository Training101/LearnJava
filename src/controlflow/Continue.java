package controlflow;

public class Continue {
	public static void main(String[] args) {

		//continue statment stops execution and moves to the new iteration
		//this prevents the printing of "more processing" in the iterations meeting continue method
		
		int arr[] = { 1, 4, 6, 3, 2, 7 };
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
			if(arr[i]>5){
				System.out.println("found a number larger than 5 : " +arr[i]);
				continue;
			}
			System.out.println("more processing");
			
		}
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class arr {

	public static boolean ispoli(int[] arr) {
		Scanner reader  = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("enter a num");
			arr[i] = reader.nextInt();

		}
		if(arr[0] == arr[4] && arr[1] == arr[3])
			return true; 
		else
			return false;
	}

}

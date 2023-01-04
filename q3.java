import java.util.Arrays;

public class q3 {

	public static int[] shiftRight (int[] arr) {
		int n = arr[arr.length - 1];
		for (int i=arr.length-1;i>0; i--) {	
			arr[i] = arr[i-1];	
		}
		arr[0]= n;
		return arr;		
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1,2,3,4,5 };
		System.out.println(Arrays.toString(shiftRight(arr)));
	}
}

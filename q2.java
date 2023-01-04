import java.util.Arrays;
import java.util.Scanner;

public class arr {


	
	
	public static int[] fiboArr(int n ) {
		int[] fibo = new int[n];	
		fibo[0] = 0;
		if(n==1) {
			return fibo; 	
		}
		fibo[1] = 1;
		for(int i = 2;i<n;i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		return fibo;
	}
	
	public static void main(String[] args) {
		
		int[] moshe = fiboArr(3);
		
		System.out.print("fibonacci: ");
		System.out.println(Arrays.toString(moshe));
		
	}

}

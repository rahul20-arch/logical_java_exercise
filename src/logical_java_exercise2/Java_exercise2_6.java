//6. Logic to find second largest element of an integer array


package logical_java_exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Java_exercise2_6 {

	public static void main(String[] args) {
//		Scanner length = new Scanner(System.in);
//		System.out.print("Array length = ");
//		int Arr = length.nextInt();
//		int B[]= {};
//		System.out.println("Array elements are: "); 
//		
//		
//		for(int i=0; i<B.length; i++)  
//		{  
//		   
//		B[i]=length.nextInt();  
//		}  
//		
//
		int Arr [] = {1,5,8,6,3,9,7,};
		Arrays.sort(Arr);
		System.out.println(Arrays.toString(Arr));
		
		System.out.println("second largest no = "+Arr[Arr.length-2]);

	}

}

//3. Insert integer numbers into an array, then copy the array elements into another array

package logical_java_exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Java_exercise2_q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		System.out.print("first integer = ");
			int a = scan.nextInt();
			
		System.out.print("second integer = ");
			int b = scan.nextInt();
		
		System.out.print("third integer = ");
			int c = scan.nextInt();
		
		int d[] = {a,b,c};
		System.out.println(Arrays.toString(d));
		
		int e[] = {d.length};
		
			e= d;
		
		System.out.println(Arrays.toString(e));
		
		
		
		
			
	}

}

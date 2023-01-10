package logical_java_exercise;

import java.util.Scanner;

public class Java_exercise_q4 {

	public static void main(String[] args) {
		
		//float  Z [];
		Scanner scan = new Scanner(System.in);
		
		System.out.print("enter first number = ");
		int A = scan.nextInt();
		
		System.out.print("enter second number = ");
		int B = scan.nextInt();
		
		System.out.print("enter third number = ");
		int C = scan.nextInt();
		
		int Z [] = {A, B, C};
		
		for(int i =0 ; i<Z.length; i++) {
			System.out.print (Z[i]+",");
		}
		
		System.out.println ();
		
		for(int j = Z.length - 1 ; j >= 0;j--) {
			System.out.print(Z[j]+ ",");
		}
		
		}
	
}

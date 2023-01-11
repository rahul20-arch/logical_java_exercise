package logical_java_exercise;

import java.util.Arrays;

public class Java_exercise_q6 {

	public static void main(String[] args) {
	 int A[]= {56,5,100,96,30,2};
	 int B = 0;
	 
	 //Arrays.sort(A);
	 for(int i =0; i< A.length; i++) {
		 System.out.print(A[i] + ",");
	 }
	 
	 System.out.println();
	 for(int i = 0; i < A.length; i++) {
		for(int j = i+1 ; j < A.length ; j++) {
			if(A[i]>A[j]) {
				B = A[i];
				A[i] = A[j];
				A[j] = B;  
				
			}
			
			
	}
	 }
	
	 System.out.print("asending order = ");
	 	for(int i =0 ; i< A.length ; i++) {
	 		System.out.print(A[i] + ",");
	 	}
	 //System.out.println(A[A.length-1]);
	 
	 
	 
	}

}

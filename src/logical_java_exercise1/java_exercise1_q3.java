//3.Given an Integer array “A”, Write a program to sum the elements of A


package logical_java_exercise;

public class java_exercise1_q3 {

	public static void main(String[] args) {
		float A []= {10,12,14,16,18,1,2,3,4,5};
		
		float sum = 0;
		for(int i =0; i< A.length; i++) {

			sum = sum + A[i];
		}
		System.out.println("sum the elements of A" + sum);
	}

}

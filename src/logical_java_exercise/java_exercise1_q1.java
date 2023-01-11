//1. Write a program to compute the standard deviation
//Steps: 
//A. Create the array with 10 numbers
//B. Calculate the average of the 10 numbers
//C. Find the difference between each element of the array and the average, then square the
//difference. Thereafter, sum the squares of differences calculated and divide by the number of elements
//(10) and then find the square root.





package logical_java_exercise;





public class java_exercise1_q1 {


	

		public static void main(String[] args) {
			
			int A[] = {1,2,3,4,5,6,7,8,9,10};
			float Total = 0;
			float Ave= 0;
			double dev = 0;
			for(int i = 0; i< A.length; i++ ) {
				Total = Total + A[i];
				
				
			}
			
			Ave = Total/ A.length;
			System.out.println("The average is" + Ave);
			
			float sum = 0;
			
			for(int i = 0; i < A.length; i++) {
				sum += (A[i] - Ave) * (A[i] - Ave);
			}
			
			dev = Math.sqrt(sum /10);
			
			System.out.println("The deviation is " + dev);
			
		}
		
	}




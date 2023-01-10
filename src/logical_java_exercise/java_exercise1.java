package logical_java_exercise;

public class java_exercise1 {


	

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




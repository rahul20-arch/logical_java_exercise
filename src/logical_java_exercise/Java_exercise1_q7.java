package logical_java_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java_exercise1_q7 {

	public static <string> void main(String[] args) {
		int A[] = {45,80,96,150};
		//List<string> li = new ArrayList<string>();
		int B = 0;
		System.out.println(Arrays.toString(A));
		B = A[0];
		A[0]= A[3];
		A[3]= B;
		
		System.out.println(Arrays.toString(A));
		
		//Collections.swap(li, 0, 3);

	}

}

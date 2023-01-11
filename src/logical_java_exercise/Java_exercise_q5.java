package logical_java_exercise;

import java.util.Arrays;

public class Java_exercise_q5 {

	public static void main(String[] args) {
		
		
		String A = "funeral";
		String B = "realfun";
		
		if(A.length()==B.length()) {
			
			char[] A_array = A.toCharArray();
			char[] B_array = B.toCharArray();
			
			Arrays.sort(A_array);
			Arrays.sort(B_array);
			
			if(Arrays.equals(A_array, B_array)) {
				
				System.out.println("A and B are anagram");
			}else {
				
				System.out.println("A and B are not anagram");
			}
		}
		else {
				System.out.println("A and B are not anagram");
			}
			
		}

	}



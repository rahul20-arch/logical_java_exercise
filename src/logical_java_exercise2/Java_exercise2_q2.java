package logical_java_exercise2;

import java.util.Arrays;

public class Java_exercise2_q2 {

	public static void main(String[] args) {
		
		String word = "Elephant";
		
		int vowels = 0;
		int con = 0;
		
		String B= word.toLowerCase();
		System.out.println(word.toLowerCase());
		
		char[] A = B.toCharArray();
		
//		Arrays.sort(A);
//		System.out.println(Arrays.toString(A));
		
		for(int i=0;i<A.length;i++) {
			if(word.charAt(i)== 'a' || word.charAt(i)=='e' || word.charAt(i)== 'i' || word.charAt(i)=='o' || word.charAt(i)=='u') {
				vowels++;
				
			}
			else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
				con++;
	}
		
		}
		
		System.out.println("vowels = " + vowels);
		System.out.println("consonants = " + con );
	}
		}


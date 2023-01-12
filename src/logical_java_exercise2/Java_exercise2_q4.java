//4.
//A) Write a program to input a paragraph as string and to find alphabet count in the given paragraph
//for the alphabet A to Z.

package logical_java_exercise2;

public class Java_exercise2_q4 {

	public static void main(String[] args) {
		String A = "Rahulsuperman";
		// A.toLowerCase();
		//String  C =A.trim();
		int count = A.replaceAll(" ","").length();
		System.out.println("Number of alphabets = "+ count);
		
		
		
	}

}

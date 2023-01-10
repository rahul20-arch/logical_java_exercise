package logical_java_exercise;

public class Java_exercise1_q2 {

	public static void main(String[] args) {

		String a = "MADAM";		
		String tem = "";
		for(int i = 4; i >= 0 ; i--) {
			tem = tem + a.charAt(i);
			
		
		
	}
		System.out.println(tem);
		
		if(a.equals(tem)) 
			System.out.println("Palindrome");
		else
			System.out.println("not a palindrome");
		}
}

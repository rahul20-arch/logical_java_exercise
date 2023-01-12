//1. Write a logic to list down unique values and times of occurrence in a given array.

package logical_java_exercise2;

import java.util.Arrays;

public class Java_exercise2_q1 {

	public static void main(String[] args) {
		int a[] = {9,5,9,2,8,9,2,1,4,3,3,3};
		int count = 0;
		Arrays.sort(a);
		
//		for(int i=0 ;i< a.length; i++ ) {
//			System.out.print(a[i] + ",");
//			}
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count8 = 0;
		int count9 = 0;
		
		
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			switch(a[i]) {
				case 1:
					count1++;
					break;
				case 2:
					count2++;
					break;
				case 3:
					count3++;
					break;
				case 4:
					count4++;
					break;
				case 5:
					count5++;
					break;
				case 8:
					count8++;
					break;
				case 9:	
					count9++;
					break;
			}			
		}
		
		System.out.println("1 - " + count1 +","+ " 2 - " + count2 +","+ " 3 - " + count3+","+ "4 - " +","+ count4 + "," + "5 - " + count5 +","+ "8 - " + count8 +","+ "9 - "+count9);
	}

}

package week1.day2.assignments4;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,7,6,8};
		int i;
		Arrays.sort(arr);
		for ( i=0;i<arr.length-1;i++)
			//System.out.print(arr[i]);
		
		if (arr[i]!=i+1) {
			System.out.println(i+1);
		break;}
	
	}
}

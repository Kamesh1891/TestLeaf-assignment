package week1.day2.assignments4;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count=0;
		int i=0;
		//Arrays.sort(arr);
		for (i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					//count++;
				System.out.println(arr[j]);
			}
			//System.out.println(arr[i]);
			
		}
		
	}


}
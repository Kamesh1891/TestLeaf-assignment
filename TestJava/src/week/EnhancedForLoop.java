package week;

import java.util.Arrays;

public class EnhancedForLoop {
	public static void RemoveDuplicates() {
		int[] arr = { 22, 999, 3, 444, 55, 666, 55, 22 };
		int i = 0,count=0;
		for (i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++)

			{
				if (arr[i] == arr[j])
					arr[j] = 0;
				
			}
		}
		for (i = 0; i <= arr.length - 1; i++) {
			if (arr[i] != 0)
				System.out.println(arr[i]);
		}
	}

public static void frequency() {
	int[] arr = { 22, 999, 3, 444, 55, 666, 55, 22,999 };
	int i = 0,count=0;
	for (i = 0; i <= arr.length - 1; i++) {
		for (int j = i + 1; j <= arr.length - 1; j++)

		{
			if (arr[i] == arr[j])
				arr[j]=0;
			
		}
		count=count+1;
	System.out.println(arr[i]+"frequency is"+count);
	//System.out.println(count);
	}
	
	
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnhancedForLoop obj=new 	EnhancedForLoop();
		//obj.RemoveDuplicates();
		obj.frequency();
		//To find the largest of the array
		/*int[] arr= {22,999,3,444,55,666};
		int large=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			//large=arr[i];
			//System.out.println(i);
		if(large<arr[i])
			large=arr[i];
		

	}
		System.out.println(large);
*/
}
}


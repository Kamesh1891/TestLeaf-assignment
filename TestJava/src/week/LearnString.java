package week;

import java.util.*;

public class LearnString {
	List<String> sampleList = new ArrayList<>(); 
	
	public void show() {
		sampleList.add("bala");
		sampleList.add("vanitha");
		sampleList.add("thamarai");
		System.out.println("with out loops");
	System.out.println(sampleList);
	System.out.println("after removing");
	sampleList.remove("vanitha");
	System.out.println(sampleList);
}
public void showfor()
{
	sampleList.add("bala");
	sampleList.add("vanitha");
	sampleList.add("thamarai");
	System.out.println("This is to show using for loop");
	for (int i = 0; i < sampleList.size()-1; i++) 
		  
		  System.out.println(sampleList.get(i));
		  

	
}
public static void main(String[]args) {
	LearnString obj=new LearnString();
	obj.show();
	obj.showfor();
}
}
	/*String txt = "Hellod Worldss";
System.out.println(txt);
char[] arr= txt.toCharArray();
int i=0;
//Arrays.sort(arr);

for (i=0;i<arr.length-1;i++)
{//System.out.println(",,,,...======================================================="+arr[i]);
	
	for(int j=i+1;j<arr.length;j++)
	{
		//System.out.println(",,,,..."+arr[i]+"............"+arr[j]);
		if(arr[i]==arr[j]) {
			System.out.println(arr[j]);
			 
		}
		
	}
	//System.out.println(arr[i]);
	
}*/





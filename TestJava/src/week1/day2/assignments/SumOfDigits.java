package week1.day2.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		int input=223,cal,sum=0;
		while( input!=0)
		{
			cal=input%10;
		sum=sum+cal;
		input=input/10;
		
		}
		
System.out.println(sum);
	}

}

package week1.day2.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range=8,firstNumber=0,secondNumber=1,sum;
				System.out.println(firstNumber);
				System.out.println(secondNumber);
				for(int i=2;i<=range;i++)
					{
					sum=firstNumber+secondNumber;
					firstNumber=secondNumber;
					secondNumber=sum;
System.out.println(sum);
	}
}
}

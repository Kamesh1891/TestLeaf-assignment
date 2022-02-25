package week1.day2.assignments4;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a1={3,2,11,4,6,7};
		int []b1={1,2,8,4,9,7};
for(int i=0;i<=a1.length-1;i++)
{
	for(int j=0;j<=b1.length-1;j++)
	{
		if(a1[i]==b1[j])
			System.out.println(a1[i]);
	}
}
	}

}

package week1.day1;

public class Mobile {
	public void makecall()
	{
		System.out.println("making call");
	}
	public void  SendMsg()
	{
		System.out.println("sending msg");
		
	}
public static void main(String[]args)
{
	Mobile obj=new Mobile();
	obj.makecall();
	obj.SendMsg();
	
}
}


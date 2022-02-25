package week1.day2.assignments;

public class PrimeNumber {
	/**
	 * @param args
	 */
	public static void main(String[]args) {
		 int i,res=0,flag=0;      
		  int n=13;//it is the number to be checked    
		  	res=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=res;i++)
		   {      
		    if(n%i==0)
		    {      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		}    
		}   
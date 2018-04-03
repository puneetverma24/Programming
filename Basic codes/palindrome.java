import java.util.Scanner;

public class Palindrome {

	
	public static void main(String[] args)
	
	{			
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the String");
		String a=sc.nextLine();
		System.out.println(new Palindrome().check(a));
				
	}
	

	String check(String a){
		int lenA=a.length();
		int j=lenA-1;
		
		Boolean flag=true;
		
		
		for(int i=0;i<lenA/2;i++){
	          if(a.charAt(i)!=a.charAt(j)){
	        	  flag=false;
	        }
	       j--;
		}
		
		
		if(flag)
		{
			return "Palindrome"; 
		}
		return "Not A Palindrome";
	}
	
}

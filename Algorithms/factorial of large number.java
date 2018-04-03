import java.util.Scanner;


public class factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

       // Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		
		
		
		factorial obj=new factorial();
		obj.fact(n);
		
	}

	
	
	void fact(int n)
	{
		int a[]=new int[200];
		a[0]=1;
		
		int k=1;
		int carry=0;
		int m=1;
		
		
		while(k<=n)
		{
		
			
		for(int i=0;i<m;i++)
		{
			int x=a[i]*k+carry;
			a[i]=x%10;
			carry=x/10;
			
			
			
		}
		
		while(carry>0)
		{
			a[m]=carry%10;
			carry=carry/10;
			m++;
			
			
		}
		
		
		k++;
		}
		
		for(int i=m-1;i>=0;i--)
		System.out.print(a[i]);
	}
	
	
}

import java.util.Scanner;


public class Power {

	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no.(base)");
	int t=sc.nextInt();
	
	System.out.print("Enter no.(power)");
	int n=sc.nextInt();
	
	int m=1;
	int a[]=new int[1000];
	int temp=0;
	int operation;
	int k=1;
    a[0]=1;
	
	while(n>=k)
	{
	for(int j=0;j<m;j++)
	{
	operation=a[j]*t+temp;
	a[j]=operation%10;
	temp=operation/10;
	
		
  }
	
	while(temp>0)
	{
		a[m]=temp%10;
		temp=temp/10;
		m++;
		
		
	}
	
	k++;
	}
	
	
	for(int kk=m-1;kk>=0;kk--)
		System.out.print(a[kk]);
	
	
	}

}

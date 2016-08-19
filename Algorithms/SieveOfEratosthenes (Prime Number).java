
public class SieveOfEratosthenes {

	
	public static void main(String[] args) {
		

int n=10000;   // find prime till n
int[] data=new int[n];
int [] prime=new int[1500]; //store prime in this
	int m=0;
for(int i=0;i<n;i++)
	data[i]=i+2;


for(int i=0;i<n;i++)
{
	
 if(data[i]!=-1)
 {
	 prime[m]=data[i];
    m++;	 
 
	
	for(int j=2*data[i]-2;j<n;j=j+data[i])
	{
		data[j]=-1;
  }
	
 }


}


	for(int i=0;i<m;i++)
		System.out.println(prime[i]);
	

	}

}

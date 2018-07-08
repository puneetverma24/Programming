/*   Property 1:- a*b=lcm* Hcf 
 *   Property 2:- Hcf(a,b) =Hcf(a-b,b)  Where a>b
 * 
 *    
 * 
 */


public class LcmHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   int a=30;
   int b=10;
 
	LcmHcf obj=new LcmHcf();
	
	int hcf=obj.hcf(a,b);
    int lcm=a*b/hcf;
	
System.out.println("Hcf: " +hcf);
System.out.println("Lcm: "+lcm);

	
	
	}
	
	int hcf(int a, int b)
	{
		
		if(a==b)
		{
			
			return a;
		}
		
		
		if(a>b)
		{
			return hcf(a-b,b);
		}

 
		return hcf(a,b-a);
	}

}

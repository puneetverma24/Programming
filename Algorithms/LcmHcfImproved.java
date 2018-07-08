/*   Property 1:- a*b=lcm* Hcf 
 *   Property 2:- Hcf(a,b) =Hcf(a-b,b)  Where a>b
 * 
 *   Improve: Instead of repeated subtracting, we can directly use modules    
 * 
 *   Time Complexity:  O(Log min(a, b))
 */


public class LcmHcfImproved {

	public static void main(String[] args) {
			
		   int a=35;
		   int b=10;
		 
			LcmHcf obj=new LcmHcf();
			
			int hcf=obj.hcf(a,b);
		    int lcm=a*b/hcf;
			
		System.out.println("Hcf: " +hcf);
		System.out.println("Lcm: "+lcm);		
			
	}

	int hcf(int a, int b)
	{
	  if(a==0)
		{	
			return b;
		}
	 return hcf(b%a, a);
	}

}




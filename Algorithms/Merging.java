/* Algorithm Merging of Two Sorted Array
 

 Let a, b be sorted Array
 
  1)Create an array temp[] of size a.length + b.length
  2)Simultaneously traverse a[] and b[].
  3)Pick smaller of current elements in a[] and b[], copy this smaller element to next position in temp[]
   and move ahead in temp[] and the array whose element is picked.
  4)If there are are remaining elements in a[] or b[], copy them also in temp[].
 */




public class Merging {
	
	
public static void main(String[] arg)
{	
	Merging merging=new Merging();
	int temp[]=merging.merge(new int[]{1,5,6,30,100},new int[]{2,4,8,9,10,20});
	
	for (int i:temp) {
		System.out.println(i);
	}
	
}


int[] merge(int[] a, int b[])
{
	int k=0;
	int j=0;
	int i=0;
	int length=a.length+b.length;
	int[] temp=new int[length]; 

	while(i<a.length && j<b.length)
	{
		
		if(a[i]<b[j]){
		temp[k]=a[i];
		i++;}			
		
		else if(a[i]>b[j]){
		temp[k]=b[j];
		 j++;}
		
		k++;
   }
	
	while(i<a.length)
	{
		temp[k]=a[i];
		i++;
		k++;
	}	
	
	while(j<b.length)	
	{
		temp[k]=b[j];
		j++;
		k++;
	}
	
	
	return temp;
	
}


}




/*   Time Complexity : O(a.length + b.length)
 *   Auxiliary Space : O(a.length + b.length)
 */


/*
Output:-
1
2
4
5
6
8
9
10
20
30
100

 */


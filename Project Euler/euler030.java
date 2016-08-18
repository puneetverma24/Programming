import java.io.*;
import java.util.*;


// brute force

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int m=0;
        
        for(int i=1;i<1000000;i++)   // taking upper limit as guess (last no. is 548834 if n=6) so you can take upto 548834 
       {       
            int j=i;
            int sum=0;
            
         while(j>0)
             {
             int temp=j%10;
             j=j/10;
             
             sum=sum+(int)Math.pow(temp,n);
             
            }
            
            if(sum==i)
                {
                a[m]=i;
                m++;
                
            }
            sum=0;
            
          }
        
        int result=0;
    for(int h=0;h<m;h++)
        result=result+a[h];
        
        result=result-1;   // to exclude 1 
        
    System.out.println(result);
    
    
    }
}
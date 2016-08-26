import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
        
        for(int j=0;j<t;j++)
            {
            
          int n=sc.nextInt();
         
            int []fact=new int[1000000];
            int k=1;
            int carry=0;
            fact[0]=1;
            int m=1;
            
            while(n>=k)
            {
                
                
                for(int i=0;i<m;i++)
                {
                    int x=fact[i]*k+carry;
                    fact[i]=x%10;
                    carry=x/10;
                    
               }
                
                while(carry>0)
                    {
                    fact[m]=carry%10;
                    carry=carry/10;
                    m++;
                   }
                
 
                k++;
            }
            
           
   
            
            long sum=0;
            for(int l=0;l<m;l++) 
           sum=sum+fact[l];
            System.out.println(sum);
            
            
            
        }
        
        
    
    
    
    }
}
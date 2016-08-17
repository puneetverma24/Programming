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
        
        long sum5=0;
        long sum3=0;
        long sum15=0;
        
       
        for(int i=0;i<t;i++)
            
        {
           long n=sc.nextLong();  
            n=n-1;
            long three=n/3;
            long five=n/5;
            long ft=n/15;            
            sum3=(long)(3*(three +three*three))/2;
            sum5=(long)(5*(five+five*five))/2;
            sum15=(long)(15*(ft+ft*ft))/2;
            
           
            
            
           
            
            
            System.out.println(sum3+sum5-sum15);
          sum5=0;
        sum3=0;
        sum15=0;
       
            
        }
    
        
        
        
        
        
        
        
    
    }
}
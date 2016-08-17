import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
   Scanner sc=new Scanner(System.in);
    
    int t=sc.nextInt();
        
        for(int i=0;i<t;i++)
            {
            long n=sc.nextInt();
            
            long sum=(n*(n+1))/2;
            sum=sum*sum;
             
            long summ=(n*(n+1)*(2*n+1))/6;
            
            
            System.out.println(sum-summ);
            
      }  
        
        
    }
}
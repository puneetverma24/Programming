import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 
    Scanner sc=new Scanner(System.in);
      
       long [] prime=new long[80000000];
            int q=0;
            
        int t=sc.nextInt();
    
              
          for(int b=0;b<t;b++)
            
            {
           long n=sc.nextLong();
              
              while(n%2==0)
              {  n=n/2;
              }
              
         if(n==1)
     {System.out.println("2");
             return;}
             
         
              int i=0;
              
        for(i=3;i<=Math.sqrt(n);i=i+2)
              {
               
                  while(n%i==0)
                  { n=n/i;}
             }
              
         
              
              if(n>2)            //  for prime numbers 
       System.out.println(n);
     else
       System.out.println(i-2);  // for odd non prime like 9,25,27 (i-2 because as at last i=i+2 false to back it to last valid i)
    
              
                      
              }
     }
}




   
  
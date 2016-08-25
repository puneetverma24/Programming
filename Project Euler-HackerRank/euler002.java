import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
   Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        long a=1,b=2;
        long c=0;
        long sum=2;
        
        
       for(int i=0;i<t;i++)
           {
           
           long n=sc.nextLong();
          
           while(c<n)
               {
           
                c=a+b;
                if(c>n)
                       {break;}
          
               if(c%2==0)
               {
               sum=sum+c;
                  // System.out.println(c);
                   
               }
           
                a=b;
                b=c;
         
              
            }
           
           System.out.println(sum);
           sum=2;
           a=1;
           b=2;
           c=0;
       
       }
    
    
    
    }
}
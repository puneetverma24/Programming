import java.io.*;
import java.util.*;
import java.math.*; 


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
               int res=0;
       
        for(int a=1;a<n;a++)
        {                                      // these loop is it find largest sum ,as 200 -->pow(199,199) will not give biggest ,so need brute force
        
            for(int b=1;b<n;b++)
        {
                
        BigInteger big = BigInteger.valueOf(a).pow(b);
        String digits = big.toString();

      
        
        
        
int sum=0;
        
for(int i = 0; i < digits.length(); i++) {
    int digit = (int) (digits.charAt(i) - '0');
     sum=sum+digit;
   }
           
          if(res<sum)  
              {res=sum;}
            
        }   
        }
            

System.out.println(res);
        
        
        
        
    }
}
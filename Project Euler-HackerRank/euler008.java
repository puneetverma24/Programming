import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
         long mul=0;
            
        for(int i=0;i<t;i++)
		{ 
            int n=sc.nextInt();
            int k=sc.nextInt();
            
          String s=sc.next();
          char []c=s.toCharArray();
            
          long prod=1;
           
         for(int h=0;h<=n-k;h++)
             {               
                   
                for(int j=0;j<k;j++)
                    { prod=prod*Character.getNumericValue(c[h+j]);
                                        
                  }
               
                if(mul<prod)
                    {mul=prod;}
                 prod=1;
                
            }
            
            System.out.println(mul);
            mul=0;
        }      
 
    }
}
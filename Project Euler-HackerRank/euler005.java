import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        int [] prim={2,3,5,7,11,13,17,19,23,29,31,37};
        
        
      
        
        for(int i=0;i<t;i++)
            {
            
            int n=sc.nextInt();
        
            long mul=1;
            
            
            for(int j=0;j<=11&&j<=n;j++)
                {
                int p=1;
                boolean flag=false;
                
                while(Math.pow(prim[j],p)<=n)
                {
                p++;
                    flag=true;
                }
                
               // System.out.println(mul);
                
                if(flag)
               {
                    mul=mul*(long)Math.pow(prim[j],p-1);
                  //  System.out.println(mul);
                    flag=false;
                }
                           
            }            
          
            System.out.println(mul);
          }
     }
}
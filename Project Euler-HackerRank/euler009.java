import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
   Scanner sc=new Scanner(System.in);
    int t =sc.nextInt();
       
        for(int i=0;i<t;i++)
        {
            
           long n=sc.nextLong();
           long b=2;
           long c=2;
           long cal=0;
            
            
            for(int a=1;a<n&&a<b;a++)
            {
                // using a+b+c=n and a*a+b*b=c*c   two equations 3 unknows ,so take a from loop ,now two equal to variable
                                
                c=(2*a*(a-n)+n*n)/(2*(n-a));     // calculate c&b for different a 
                b=n-a-c;                           
                                        
                if((a*a+b*b==c*c))
                    {
                    cal=a*b*c;                                                        
                }
            }
            
            
          
            if(cal==0)
            System.out.println(-1);            
            else
                System.out.println(cal);                           
          }
    }
}
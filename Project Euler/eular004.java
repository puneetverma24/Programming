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
            int n=sc.nextInt();
            
           
            
            int g=n-1;
            
            for(int j=g;j>=99999;j--)   //it should upto 99999  ,because min number is 101010 --> 999999
            {
                int x=j;
                
              
                char []c =String.valueOf(x).toCharArray();
                
                int z=c.length/2;
                
                int q=0,w=c.length;
                w=w-1;
                boolean flag=true;
                boolean flag2=false;
              
        
             
                
                while(z>0)
                {
                 
                  
                    if(c[q]!=c[w])
                        
                        {
                        flag=false;
                        
                       }
                    q++;
                 
                    
                    w--;
                    z--;
               }
                

                if(flag)
                {
                   
                    for(int p=100;p<=999;p++)
                    {
                        if(j%p==0)
                            {
                            
                            int f=j/p;
                            
                            if(f>=100 &&f<=999)  // f ie 3 digit no 
                                {
                                flag2=true;
                                
                            }
                        }
                        
                    }
                    
                    
                }
                
                
                
                if(flag2)
                    
                    {
                     System.out.println(j);
                    break;
                    
                    
                }
                
                
                
                
                
            }
            
            
        }
        
    
    
    
    }
}
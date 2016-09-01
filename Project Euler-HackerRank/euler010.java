import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    
 
    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
            
            
            
             int []data=new int[1000000];
             long []sum=new long[1000000];
        
              long fg=0;
        
        
            int da=1000000;
          
            for(int j=0;j<da;j++)
           {data[j]=j+2;}
              
              
            for(int k=0;k<da;k++)
                {
                
                if(data[k]!=-1)
                    { 
                   
                                  
                        sum[k]=fg+data[k];
                     fg=sum[k];
                     
                        for (int j=(2*data[k]-2);j<da;j+=data[k])
                        data[j]=-1;
              }
                else
                    {
                    sum[k]=fg;
                }
                
            }
            
            
            
     
              
          for(int i=0;i<t;i++)
            
            {
           int n=sc.nextInt();
          
            System.out.println(sum[n-2]);
            
           }
    
    }
}
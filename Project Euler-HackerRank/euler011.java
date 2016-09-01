import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int [][]a=new int[20][20];
        
        
        
    for(int i=0;i<20;i++)
    {
        
        for(int j=0;j<20;j++)
        {
            a[i][j]=sc.nextInt();
            
        }
        
        
    }
    
    int mul=0;
        int temp=1;
         
    for(int i=0;i<20;i++)
    {
        
        for(int j=0;j<20;j++)
        {
            
            //for right side
            
           
            for(int k=j;k<=j+3 && j<=16;k++)
                {
                temp=a[i][k]*temp;
         
               }
            
              if(mul<temp)
            {
                  mul=temp;
                  
              }
            temp=1;
            
        
            
            
           //for down side
          
            
            for(int k=i;k<=i+3 && i<=16;k++)
                {
                temp=a[k][j]*temp;
         
               }
            
              if(mul<temp)
            {
                  mul=temp;
                  
              }
            temp=1;
         
             
            
             //for dia
            
                int x=i;
            int z=j;
            
             if(x<=16 && z<=16)
                {
                 
            
            for(int k=1;k<=4;k++)
                {
                 
                   
                
                temp=a[x][z]*temp;
                x++;
                z++;
                
               
         
               }
            
              if(mul<temp)
            {
                  mul=temp;
                  
              }
            temp=1;
            
             }
            
            
            
            
            
            //dia down

          
            
                 x=i;
               z=j;
            
             if(x<=16 && z>=3)
                {
                 
            
            for(int k=1;k<=4;k++)
                {
                 
                   
                
                temp=a[x][z]*temp;
                x++;
                z--;
                
               
         
               }
            
              if(mul<temp)
            {
                  mul=temp;
                  
              }
            temp=1;
            
             }
            
            
            
            
            
            
        }
        
        
    }
    
    System.out.println(mul);
    
    
    
    
    }
}
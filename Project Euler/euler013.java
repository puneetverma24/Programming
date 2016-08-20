import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {  
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        
        
        for(int i=0;i<n;i++)
           s[i]=sc.next();
          
         int result []=new int[60];
         int p=0;
         int temp=0;
         int a=0;
        
       for(int j=49;j>=0;j--)
            {            
              a=temp;
                     
              for(int i=0;i<n;i++)
               a = a + s[i].charAt(j)-'0';  //as harAt gives ascii value 
                
               result[p]=a%10;
               p++;
               temp=a/10;
           }
        
   while(temp>0)
        { 
         result[p]=temp%10;
         temp=temp/10;
         p++;
         }
        
        
        for(int i=p-1;i>p-11;i--)
          System.out.print(result[i]);
       
    }
}
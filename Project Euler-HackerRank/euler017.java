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
            long n=sc.nextLong();
            
           
            if(n==0)
                System.out.println("Zero ");
                    
            else {
            
            long p=n/1000000000000l;   
            
            long a=n/1000000000;          
                
              a=a-p*1000;                       
                
                long b=n/1000000;   
            b=b-a*1000-p*1000000;          
            
            long c=n/1000;
           c=c-b*1000-a*1000000-p*1000000000;    
            
          long d=n-b*1000000-a*1000000000-c*1000-p*1000000000000l;
            
            
        Solution obj=new Solution();
            
            
            obj.hund(p);
             if(p>0)
            System.out.print("Trillion ");
            
            
            
            obj.hund(a);
             if(a>0)
            System.out.print("Billion ");
            
                 
             obj.hund(b);
            if(b>0)
             System.out.print("Million ");
            
            
             obj.hund(c);
            if(c>0)
             System.out.print("Thousand ");
            
            
            obj.hund(d);
            
             System.out.println("");
            
            }
            
        }
            
            
            
            
        }
        
        void hund(long t)
            {
        
             int a=(int)t/100;  
             int b=(int)(t/10 - a*10);  
             int c=(int)t%10;     
            
            
         
            
            
            switch(a)
                {
                    
                case 1: System.out.print("One ");
                         break;
                case 2:System.out.print("Two ");
                         break;
                
                case 3: System.out.print("Three ");
                         break;
                case 4:System.out.print("Four ");
                         break;
                
                case 5: System.out.print("Five ");
                         break;
                case 6:System.out.print("Six ");
                         break;
                
                case 7: System.out.print("Seven ");
                         break;
                case 8:System.out.print("Eight ");
                         break;
                
                case 9: System.out.print("Nine ");
                         break;
                default:System.out.print("");
                         break;
                
            }
            
            if(a>0)
            System.out.print("Hundred ");
            
            //234  2  
                
            int f=b*10+c;    
                
            
            if(f>=11 &&f<=19)
                
            {
                switch(f)
                    {
                
                
                case 11: System.out.print("Eleven ");
                         break;
                case 12:System.out.print("Twelve ");
                         break;
                
                case 13: System.out.print("Thirteen ");
                         break;
                case 14:System.out.print("Fourteen ");
                         break;
                
                case 15: System.out.print("Fifteen ");
                         break;
                case 16:System.out.print("Sixteen ");
                         break;
                
                case 17: System.out.print("Seventeen ");
                         break;
                case 18:System.out.print("Eighteen ");
                         break;
                
                case 19: System.out.print("Nineteen ");
                         break;
                default:System.out.print("");
                         break;
                
                
                }
                
            }    
            
            
            
            
            else 
                {
            
            switch(b)
                {
                
                
                case 1:System.out.print("Ten ");
                         break;
                
                
                
                
                
                
                case 2:System.out.print("Twenty ");
                         break;
                
                case 3: System.out.print("Thirty ");
                         break;
                case 4:System.out.print("Forty ");
                         break;
                
                case 5: System.out.print("Fifty ");
                         break;
                case 6:System.out.print("Sixty ");
                         break;
                
                case 7: System.out.print("seventy ");
                         break;
                case 8:System.out.print("Eighty ");
                         break;
                
                case 9: System.out.print("Ninty ");
                default:System.out.print("");
                         break;
               
                
            }
            
            
            switch(c)
                {
                
            
                
                
                case 1: System.out.print("One ");
                         break;
                case 2:System.out.print("Two ");
                         break;
                
                case 3: System.out.print("Three ");
                         break;
                case 4:System.out.print("Four ");
                         break;
                
                case 5: System.out.print("Five ");
                         break;
                case 6:System.out.print("Six ");
                         break;
                
                case 7: System.out.print("Seven ");
                         break;
                case 8:System.out.print("Eight ");
                         break;
                
                case 9: System.out.print("Nine ");
                         break;
                default:System.out.print("");
                         break;
                
            }
            
            }
           
            
        }
        
    
    
    
}
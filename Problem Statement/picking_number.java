import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;


public class Solution {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] arr = new int[n];

    int i,j,k;
    for(i=0;i<n;i++)
    {
        arr[i] = scan.nextInt();
    }
    int sum = 0,count = 0;
    int max=1;
    for (j=0;j<n;j++)
    {
        count =0;
        for(k=0;k<n;k++)
        {
            
            if(j==k)
            {
                continue;
            }
            else 
            {
            sum = arr[j]-arr[k];
            if(sum>=-1 && sum <=1)
            {
                count++;
            }
            }

            if (count>=max)
            {
                max=count;
            }
            
        }
        
    }
System.out.println(max);

    }
}

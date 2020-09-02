//Half test case passed
//v.01

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void almostSorted(int[] arr) {
        int len = arr.length;
        int[] error= new int[len];

        int p = 0;
        if (arr[0]>arr[1])
            {
                error[p] =1;
                p++;
            }
        for(int i = 1; i<len-1;i++)
        {

            if(arr[i]>arr[i+1] || arr[i]<arr[i-1])
            {
                error[p] =i+1;
                p++;
            }
        }
        
        if(arr[len-2]>arr[len-1] || arr[len-2]<arr[len-3] )
        {
            error[p] = len ;
        }
        int s= end(error);
        if(s ==2)
        {
            System.out.println("yes");

            System.out.println("swap" +" " +(error[0]) +" "+(error[1]+1));
        }
        else if(s>2)
        {
            System.out.println("yes");

            int t= end(error);
            System.out.println("reverse" + " "+(error[0]) +" "+(error[t-1]+1));
        }
        else
            System.out.println("no");
    }

    public static int end(int[] error)
    {
        int k = 0;
        int leng = error.length;
        for(int j = 0; j<leng;j++)
        {   
            
            if(error[j]== 0)
            {
                break;
            }
            k++;
        }
        return k-1;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        almostSorted(arr);

        scanner.close();
    }
}

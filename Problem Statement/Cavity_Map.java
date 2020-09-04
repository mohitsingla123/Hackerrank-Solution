//Cavity Map
//problem statement link: https://www.hackerrank.com/challenges/cavity-map/problem4
//Solution with all test cases passed:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    char[][] arr = new char[n][n];
    int i,j;
    for(i =0;i<n;i++)
    {
        String p = scan.next();
        arr[i] = p.toCharArray();
    }
    for(i=1;i<n-1;i++)
    {
        for(j=1;j<n-1;j++)
        {
            if((arr[i][j]>arr[i][j+1]) && (arr[i][j]>arr[i][j-1]) && (arr[i][j]>arr[i-1][j]) && (arr[i][j]>arr[i+1][j]) )
            {
                arr[i][j] = 'X';
            }
        }
    }
for(i=0;i<n;i++)
{
    for (j=0;j<n;j++)
    {
        System.out.print(arr[i][j]);
    }
    System.out.println("");
}
    }
}

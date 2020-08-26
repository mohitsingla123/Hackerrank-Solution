/*
Proble statement link: https://www.hackerrank.com/challenges/picking-numbers/problem

problem statement:

Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is less than or equal to . For example, if your array is , you can create two subarrays meeting the criterion:  and . The maximum length subarray has  elements.

Function Description

Complete the pickingNumbers function in the editor below. It should return an integer that represents the length of the longest array that can be created.

pickingNumbers has the following parameter(s):

a: an array of integers
Input Format

The first line contains a single integer , the size of the array .
The second line contains  space-separated integers .

Constraints

The answer will be .
Output Format

A single integer denoting the maximum number of integers you can choose from the array such that the absolute difference between any two of the chosen integers is .

Sample Input 0

6
4 6 5 3 3 1
Sample Output 0

3
Explanation 0

We choose the following multiset of integers from the array: . Each pair in the multiset has an absolute difference  (i.e.,  and ), so we print the number of chosen integers, , as our answer.

Sample Input 1

6
1 2 2 3 1 2
Sample Output 1

5
Explanation 1

We choose the following multiset of integers from the array: . Each pair in the multiset has an absolute difference  (i.e., , , and ), so we print the number of chosen integers, , as our answer.
*/





//Solution:
//all test case passed
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
        count =1;
        for(k=0;k<n;k++)
        {
            
            if(j==k)
            {
                continue;
            }
            else 
            {
            if(arr[j]==arr[k] || arr[j]+1 ==arr[k])
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

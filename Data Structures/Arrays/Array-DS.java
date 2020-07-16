/*
_________________________________________________Problem Statement___________________________________________________

Problem Statement Link: https://www.hackerrank.com/challenges/arrays-ds/problem

An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  (you may also see it written as ).

Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.

Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

Input Format

The first line contains an integer,  (the number of integers in ).
The second line contains  space-separated integers describing .

Constraints

Output Format

Print all  integers in  in reverse order as a single line of space-separated integers.

Sample Input 1

CopyDownload
Array: arr
1
4
3
2

 
4
1 4 3 2
Sample Output 1

2 3 4 1

____________________________________________________________Solution_______________________________________________
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) throws IOException {
   
       Scanner scanner = new Scanner(System.in);

        int arrCount = scanner.nextInt();
 
        int[] arr = new int[arrCount];

        for (int i = 0; i < arrCount; i++) {
            arr[i] = scanner.nextInt();
        }
        
        for (int k = arrCount-1; k>=0; k--)
        {
            System.out.print(arr[k]+" ");
        }
        scanner.close();
    }
}


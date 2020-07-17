/*
___________________________________________________ Problem Statement _______________________________________________________________

Problem Statement in image format: https://github.com/mohitsingla123/Hackerrank-Solution/blob/master/Problem%20statement%20Image%20file/java_loop_02%20problem.PNG

We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use , , and  to produce some series :

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use , , and  to produce some series :

We then print each element of our series as a single line of space-separated values

__________________________________________________ Solution ______________________________________________________________

*/

import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        for(int j=0;j<i;j++)
        {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        int result=a;
            for(int k=0;k<n;k++)
            {
            result=(int)Math.pow(2,k)*b + result;
            System.out.print(result+" ");
            }
            System.out.println();
        }
    }
}

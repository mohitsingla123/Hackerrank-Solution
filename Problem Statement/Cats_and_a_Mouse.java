/*
Problem statement link : https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

Problem Statement:
Two cats and a mouse are at various positions on a line. You will be given their starting positions. Your task is to determine which cat will reach the mouse first, assuming the mouse doesn't move and the cats travel at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.

You are given  queries in the form of , , and  representing the respective positions for cats  and , and for mouse . Complete the function  to return the appropriate answer to each query, which will be printed on a new line.

If cat  catches the mouse first, print Cat A.
If cat  catches the mouse first, print Cat B.
If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.
For example, cat  is at position  and cat  is at . If mouse  is at position , it is  units from cat  and  unit from cat . Cat  will catch the mouse.

Function Description

Complete the catAndMouse function in the editor below. It should return one of the three strings as described.

catAndMouse has the following parameter(s):

x: an integer, Cat 's position
y: an integer, Cat 's position
z: an integer, Mouse 's position
Input Format

The first line contains a single integer, , denoting the number of queries.
Each of the  subsequent lines contains three space-separated integers describing the respective values of  (cat 's location),  (cat 's location), and  (mouse 's location).

Constraints

Output Format

For each query, return Cat A if cat  catches the mouse first, Cat B if cat  catches the mouse first, or Mouse C if the mouse escapes.

Sample Input 0

2
1 2 3
1 3 2
Sample Output 0

Cat B
Mouse C
Explanation 0

Query 0: The positions of the cats and mouse are shown below: image

Cat  will catch the mouse first, so we print Cat B on a new line.

Query 1: In this query, cats  and  reach mouse  at the exact same time: image

Because the mouse escapes, we print Mouse C on a new line.








Solution:
All test cases passed
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

static String catAndMouse(int x, int y, int z) {
String p="";
int a = x-z;
int b = y-z;
if(a<0)
{
    a = a*(-1);
}
if(b<0)
{
    b = b*(-1);
}
if(a==b)
{
    p="Mouse C";
}
else if(a<b)
{
    p="Cat A";
}
else
{
    p="Cat B";
}
return p;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

/*
link: https://www.hackerrank.com/challenges/time-conversion/problem

Problem statement: 

Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

s: a string representing time in  hour format
Input Format

A single string  containing a time in -hour clock format (i.e.:  or ), where  and .

Constraints

All input times are valid
Output Format

Convert and print the given time in -hour format, where .

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45




Solution:

*/


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {

        int a = (int)s.charAt(0)-'0';
        int b = (int)s.charAt(1)-'0';
        // - '0' is because ascii value of 0 which is 48 is added in variable a and b, so resolve this issue subtract '0' from a and b
        int hh = a*10 + b%10;
        if (s.charAt(8)=='A')
        {
            if (hh==12)
            {
            System.out.print("00");
            for (int k = 2; k<8;k++)
            System.out.print(s.charAt(k));
            }
            else
            {
            for (int l = 0; l<8;l++)
            System.out.print(s.charAt(l));
            }                
            }

        if (s.charAt(8)=='P')
        {
            if (hh==12)
            {
            for (int l = 0; l<8;l++)
            System.out.print(s.charAt(l));
            }                
            else
            {
            hh = hh+12;
            System.out.print(hh);
            for (int k = 2; k<8;k++)
            System.out.print(s.charAt(k));
            }
        }
       String k = "hello";
        return k;
    }
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     //   BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        //String result = 
        timeConversion(s);

     //   bw.write(result);
      //  bw.newLine();

       // bw.close();
    }
}

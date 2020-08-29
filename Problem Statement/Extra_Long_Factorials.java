/*
Problem statement link:

Solution with all test case passed
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void extraLongFactorials(int n) {
        BigInteger sum = new BigInteger("1");
        if(n==0)
        {
            System.out.println(1);
        }
        else
        {
        while(n>=1)
        {
            sum = sum.multiply(BigInteger.valueOf(n));
            n--;
        }
        }
        System.out.println(sum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}

/*
___________________________________________________________Problem Statement______________________________________________________

Problem statement Link: https://www.hackerrank.com/challenges/java-primality-test/problem

A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .

Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

Input Format

A single line containing an integer,  (the number to be checked).

Constraints

 contains at most  digits.
Output Format

If  is a prime number, print prime; otherwise, print not prime.

Sample Input

13
Sample Output

prime
Explanation

The only positive divisors of  are  and , so we print prime.'

_____________________________________________________________Solution____________________________________________________

all test cases passed.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();

        System.out.println(n.isProbablePrime(100)? "prime" :"not prime");
       
        scanner.close();
    }
}

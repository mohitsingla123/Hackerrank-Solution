/*
________________________________________________________Problem Statement___________________________________________________

Problem Statement Link: https://www.hackerrank.com/challenges/java-string-reverse/problem

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes

______________________________________________Solution_______________________________________________

*/
import java.io.*;
import java.util.*;
import java.lang.*; 

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        

        StringBuilder B = new StringBuilder(); 
  
        // append a string into StringBuilder B 
        B.append(A); 
  
        // reverse StringBuilder B 
        B = B.reverse(); 

        //converting StringBuilder into String using toString\
        
        if ((A.compareTo(B.toString())==0))
        {
            System.out.println("Yes");
        }
        else
        {
        System.out.println("No");
        }
    }
}


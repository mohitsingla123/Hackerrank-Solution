/*
Problem Statement link: https://www.hackerrank.com/challenges/append-and-delete/

*/

//Solution with all Test Cases Passed:

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String appendAndDelete(String s, String t, int k) {
        int len1 = s.length();
        int len2 = t.length();
        int len;
        int min = Math.min(len1,len2);
        int max = Math.max(len1,len2);
        String res = "";
        if(k>=len1+len2)
        res = "Yes";
        else 
        {
            for (int i = 0;i<min;i++)
            {
                if(s.charAt(i)!= t.charAt(i))
                {
                    len = (len1-i) + (len2-i);
                  //   System.out.println(len);
                    if(((k-len) % 2 ==0 || len ==k) && len <=k)
                    
                     {
                        res = "Yes";
                     }
                    else
                     {
                     res = "No";
                     }
                    
                     break;
                }
                else if(i == min-1)
                {
                    len = max-min;
                    //System.out.println((k-len)%2 ==0);
                    if((k-len) % 2 ==0 || len ==k)
                     {
                     res = "Yes";
                     }
                     else
                     {
                     res = "No";
                     }
                    
                     break;
                }
            }

            }
        
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

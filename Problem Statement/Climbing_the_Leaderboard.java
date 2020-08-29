// Problem Statement link: https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
// some test dosn't pass because of time out


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

            int len = alice.length;
            int len2 = scores.length;
            int[] rank = new int[len];

        for (int i=0;i<len;i++)
        {
            int count =1;
            int k = alice[i];

            for(int j = 0;j<len2;j++)
            {
                if(k< scores[j] && j == len2-1)
                {
                   System.out.println("Condition found");
                    rank[i]=count+1;
                    break;
                }
                System.out.println(scores[j]);
                if(k<scores[j] && scores[j]!=scores[j+1])
                {
                    count++;
                    System.out.println(count);
                }
                else if(k>=scores[j] )
                {
                    rank[i]=count;
                    break;
                }
            }

        }
        return rank;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

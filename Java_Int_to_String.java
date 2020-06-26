/*
___________________________________________________________Problem Statement____________________________________________________________________________

Problem Statement Link: https://www.hackerrank.com/challenges/java-int-to-string/problem


You are given an integern , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

n can range between -100 to +100 inclusive.

Sample Input 0

100
Sample Output 0

Good job


________________________________________________________________Solution_____________________________________________________________________
*/

import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   
    String s = String.valueOf(n);

    //we cab also use this code also - String s = "" + n;

   // valueOf is use to converet int into String and parseInt is use for String into int.
   // in Java both int and Integer are used to store integer type data the major difference between both is type of int is primitive while Integer is of class type.
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}

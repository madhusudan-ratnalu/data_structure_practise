package com.string.program;

import java.util.Scanner;

public class StringPalindromeOrNot {

    /*1. Naive Approach to Check Palindrome String  in Java
By Reversing the given string and Comparing.
We can check if the given string is a palindrome
 by comparing the original string with its reversed version.
 _____________________
 Time Complexity:-The time complexity of the given code is O(n), where n is the length of the input string.
  This is because the for loop iterates through each character in the string once to create the reverse string.

Space Complexity:- The space complexity of the code is O(n), where n is the length of the input string.
This is because the reverse string is created and stored in a separate string variable,
which takes up space in memory proportional to the length of the input string. In addition,
 the other variables used in the code (i, str, and ans) take up a constant amount of space that is independent of the input size.

 */
    public static void isStringPalindromeNaiveApproach(String stringToVerify) {
        String reversedString = "";
        for (int startIndex = stringToVerify.length() - 1; startIndex >= 0; startIndex--) {
            reversedString = reversedString + stringToVerify.charAt(startIndex);
        }
        System.out.println(reversedString);
        if (stringToVerify.equalsIgnoreCase(reversedString)) {
            System.out.println("String is palindrome " + stringToVerify + " == " + reversedString);
        } else {
            System.out.println("String is not palindrome " + stringToVerify + " == " + reversedString);
        }
    }

    /*Our approach will be that we will first convert the string to lowercase. Then, we will take two pointers i pointing to the start
    of the string and j pointing to the end of the string. Keep incrementing i and decrementing j while i < j and at every
    step check whether the characters at these pointers are the same or not. If not then the string is not a palindrome else it is.
    Time Complexity:- The time complexity of the given code is O(n), where n is the length of the input string.
     This is because the while loop iterates through half of the string to check if it is a palindrome.
      Since we only check half of the string, the number of iterations is proportional to n/2, which is O(n).

Space Complexity:- The space complexity of the code is O(1),
because the code only uses a constant amount of additional space that is independent of the input size.
The only variables used in the code are i, j, and str, which each take up a constant amount of space.
 No additional space is created in the code.
    */
    public static void isStringPalindromeTwoPointerMethodApproach(String stringToVerify) {
        int startIndex = 0;
        int endIndex = stringToVerify.length() - 1;

        while (startIndex < endIndex) {
            if (stringToVerify.charAt(startIndex) != stringToVerify.charAt(endIndex)) {
                System.out.println("String is not palindrome " + stringToVerify);
                return;
            }
            startIndex++;
            endIndex--;
        }
        System.out.println("String is palindrome " + stringToVerify);
    }

    public static void isStringPalindromeRecursiveApproach(String stringToVerify) {
        String reversedString = "";

        System.out.println(reversedString);
        if (stringToVerify.equals(reversedString)) {
            System.out.println("String is palindrome " + stringToVerify + " == " + reversedString);
        } else {
            System.out.println("String is not palindrome " + stringToVerify + " == " + reversedString);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check weather string is palindrome or not");
        String stringToVerify = sc.nextLine();
        // isStringPalindromeNaiveApproach(stringToVerify);
        isStringPalindromeTwoPointerMethodApproach(stringToVerify.toLowerCase());
        sc.close();
    }
}

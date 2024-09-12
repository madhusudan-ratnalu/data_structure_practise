package com.string.program;

import java.util.Scanner;

public class InsertStringIntoAnotherString {

    public static void insertStringIntoNewStringAndPrintIt(String originalString, String stringToInsert, int index) {
        String newString = "";

        if (originalString != null && !originalString.isEmpty()) {
            for (int startIndex = 0; startIndex < originalString.length(); startIndex++) {

                newString = newString + originalString.charAt(startIndex);
                if(startIndex==index){
                    newString=newString+stringToInsert;
                }
            }
            System.out.println("newly formed string is " + newString);
        } else {
            System.out.println("Input is Null");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string for input");
        String originalString = sc.nextLine();

        System.out.println("Enter string to replace in middle");
        String stringToInsert = sc.nextLine();

        System.out.println("Enter index number to add new string");
        int index = sc.nextInt();

        insertStringIntoNewStringAndPrintIt(originalString, stringToInsert, index); //input is : GeeksGeeks
        sc.close();
    }
}

/* 
 Algorithm
Step-1 : Get the Strings and the index.
Step-2 : Create a new String
Step-3 : Traverse the string till the specified index and copy this into the new String.
Step-4 : Copy the String to be inserted into this new String
Step-5 : Copy the remaining characters of the first string into the new String
Step 6 : Return/Print the new String
 */

 
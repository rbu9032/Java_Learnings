package com.java.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringAssignments {

    private static String getReverseString(String str) {
        String revWrd = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            revWrd += str.charAt(j);
        }
        return revWrd;
    }

    public static void main(String[] args) {
        // StringAssignments sa = new StringAssignments();
        Scanner sc = new Scanner(System.in);

        //Assignment-01 --java program to count the number of characters in a string
        /*System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Input string: " +str);    //Input: java is super
        System.out.println("Length of the given string:" +str.length()); */ //13

        //Assignment-02 --java program to count the number of words in a string
        /*System.out.println("Enter the string:");
        String str = sc.nextLine();
        String[] str2 = str.split(" ");
        System.out.println("Input string: " +str);   //Input: java is super
        System.out.println("No.of words in string:" +str2.length);    //3*/

        //Assignment-03  --java program to count the total number of occurrences of a given character is a string
       /* System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Enter the target character:");
        char targetChar = sc.next().charAt(0); //or char targetChar= 'l';
       *//* int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == targetChar){
                count++;
            }
        }*//*
        //other way of doing the above
        char[] characters = str.toCharArray();
        int count = 0;
        for(int i=0; i<characters.length; i++){
            if(characters[i] == targetChar){
                count++;
            }
        }
        System.out.println("Input string: " +str);
        System.out.println("Target Character:"+targetChar);
        System.out.println("Total no.of occurrence of a given character:"+count);*/

        //Assignment-04 --java program to reverse a string
        /*System.out.println("Enter the string:");
        String str = sc.nextLine();
        String revStr ="";
        for (int i =str.length()-1; i>=0; i--){
            revStr += str.charAt(i);
        }
        System.out.println("Input string: " +str);
        System.out.println("Reversed string:"+revStr);*/

        //Assignment-05  --java program to remove all starting and ending spaces from a string
        /*System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Input string:"+str);
        System.out.println("Output:"+str.trim());*/

        //Assignment-06 --java program to reverse each word of a given string
     /*   System.out.println("Enter the string:");
        String str = sc.nextLine();
        String revStr = "";
        String[] words = str.split(" ");
       for (int i=0; i<words.length; i++){
          String word =  words[i];
          String revWrd = "";
          for (int j=word.length()-1; j>=0; j--){
              revWrd += word.charAt(j);
          }
          if(i != words.length-1){
              revStr += revWrd + " ";
          } else{
              revStr += revWrd;
          }

       }
        System.out.println("Input string:" +str);
        System.out.println("Output string:" +revStr);*/
        //another approach for reversing all words in a string by using a method
    /*    System.out.println("Enter the string:");
        String str = sc.nextLine();
        String revStr = "";
        String[] words = str.split(" ");
        for (int i=0; i<words.length; i++){
            String word =  words[i];
            String revWrd = getReverseString(word);
            if(i != words.length-1){
                revStr += revWrd + " ";
            } else{
                revStr += revWrd;
            }

        }
        System.out.println("Input string:" +str);
        System.out.println("Output string:" +revStr);*/


        //Assignment-07 --java program to modify the string in the following pattern
        /*input: This is a test String!!
         * output: THIS si A tset STRING*/
        /*System.out.println("Enter the string:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String outStr = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i % 2 == 0) {
                outStr += word.toUpperCase();
            } else {
                outStr += getReverseString(word);
            }
            if (i != words.length - 1) {
                outStr += " ";
            }
        }
        System.out.println("Input:" + str);
        System.out.println("Output:" + outStr);*/

        //Assignment-08
        /*java program to find the count of uppercase letters, lowercase letters,
        digits and special characters in a given string
        input: JavA5is&Su6p%eR*
        output: Uppercase letters-4
                Lowercase letter-7
                Special characters-2
                Digits-2/
         */
       /* System.out.println("Enter the string:");
        String str = sc.nextLine();
        int upperCase = 0;
        int lowerCase = 0;
        int specialCharacters = 0;
        int digits = 0;
        char[] characters = str.toCharArray();
        for (char ch:characters) {
           if(Character.isUpperCase(ch)){
               upperCase++;
           } else if (Character.isLowerCase(ch)) {
             lowerCase++;
           } else if (Character.isDigit(ch)) {
              digits++;
           }else{
               specialCharacters++;
           }
        }

        System.out.println("Input:"+str);
        System.out.println("Uppercase letters-"+upperCase);
        System.out.println("Lowercase letters-"+lowerCase);
        System.out.println("Special Characters-"+specialCharacters);
        System.out.println("Digits-"+digits);*/

        //Assignment-09  --java program to find the first repeated and non-repeated character in the given string
        /*input: java is easy
        * output:First Repeated Character-a
                 First Non-Repeated Character-j        */
        /*System.out.println("Enter the string:");
        String str = sc.nextLine();
        char firstRepeated = ' ';
        char firsNonRepeated = ' ';
        for (int i = 0; i < str.length(); i++) {
            char tempChar = str.charAt(i);
            if (str.charAt(i) != ' ') {
                if (str.indexOf(tempChar) == str.lastIndexOf(tempChar)) {
                    if(firsNonRepeated == ' '){
                        firsNonRepeated = tempChar;
                    }
                } else if (firstRepeated == ' ') {
                    firstRepeated = tempChar;
                }if(firsNonRepeated != ' ' && firstRepeated != ' '){
                    break;
                }
            }
        }
        System.out.println("Input:"+str);
        System.out.println("First Repeated Character:"+firstRepeated);
        System.out.println("First Non-Repeated Character:"+firsNonRepeated);
*/

        //Assignment-10
        /*java program to create an array using words at odd position in a string
         input:java is super keka easy and awesome
         output:{"is","keka","and"}*/
        /*System.out.println("Enter the string:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String[] outArr = new String[words.length/2];
        int index = 0;
        for (int i=0; i< words.length;i++){
            if(i%2 != 0){
                outArr[index]= words[i];
                index++;
            }
        }
        System.out.println("Input:"+str);
        System.out.println("Output:"+Arrays.toString(outArr));*/




        //Assignment-11
        /*java program to find the max length word in a given string
           (if two words are of same length then return the first occurring
            word of max length)
            input:hello how are you Moooommmmmm output:Moooommmmmm
            input:hello how are you reddy output:hello*/
        /*System.out.println("Enter the string:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String maxLengthWord = words[0];
        for (int i=1;i<words.length;i++){
            if(maxLengthWord.length() < words[i].length()){
                maxLengthWord = words[i];
            }
        }
        System.out.println("Input:"+str);
        System.out.println("Output:"+maxLengthWord);*/

        //Assignment-12
        /*Compare two strings, if the characters in string-1 are present in string-2,
          then it should be printed as such in output, else '+' should be printed in
          output(ignore case difference)
          input-1:New York  input-2:NWYR
          output:N+w+Y+r+
        */
        /*System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        String outStr = "";
        for(int i =0; i<str1.length();i++){
            char tempChar = str1.toLowerCase().charAt(i);
            if(str2.toLowerCase().indexOf(tempChar) >= 0){
                outStr += str1.charAt(i);
            }else{
                outStr += '+';
            }
        }
        System.out.println("Input-1:"+str1);
        System.out.println("Input-2:"+str2);
        System.out.println("Output:"+outStr);*/


        //Assignment-13
        /*Given the first name and last name, print the last name first
          then followed by "," and first character of the first name
          input-1:Steve(First Name)  input-2:Jobs(Last Name)
          output:Jobs, S
        */
       /* System.out.println("Enter the first name:");
        String firstName = sc.nextLine();
        System.out.println("Enter the last name:");
        String lastName = sc.nextLine();
        System.out.println("Enter the index number:");
        int i = sc.nextInt();
        String outStr = lastName + "," + firstName.charAt(i);
        System.out.println("Input-1:"+firstName);
        System.out.println("Input-2:"+lastName);
        System.out.println("Output:"+outStr);*/

        //Assignment-14
        /*java program to print the filename extension in console
          input:passport.jpg      output:jpg
          input:pan card.png      output:png
          input:resume.pdf      output:pdf
        */
        /*System.out.println("Enter the file name:");
        String fileName = sc.nextLine();
        String outStr = fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());
        System.out.println("Input:"+fileName);
        System.out.println("Output:"+outStr);*/

        //Assignment-15
        /*java program to verify whether the given string is palindrome or not
        input:JavaJ           output:It is a palindrome
        input:Javaj           output:It is not a palindrome
        input:hyrtutorials    output:It is not a palindrome
        */
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String revStr ="";
        for (int i =str.length()-1; i>=0; i--){
            revStr += str.charAt(i);
        }
        if (revStr.equals(str)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

        sc.close();
    }


}

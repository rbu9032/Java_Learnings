package com.java.string;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        //Different ways to create a string
       /* String s1  = "hello ";
        String s2  = new String("Welcome to Java String");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1+s2);*/

        //comparing strings
        /*String s1 = "hello";  //when we initialize this type of string it will store data in string pool
        String s2 = "hello";
        String s3 = new String("hello");   //when we initialize this type of string it will store data in heap memory
        String s4 = new String("hello");
        String s5 = "Rocky";
        String s6 = "rocky";
        System.out.println(s3==s4);  //o/p:false
        System.out.println(s1==s2);  //o/p:true
        System.out.println(s1==s3);  //o/p:false  --because this method will compare the memory address

        System.out.println(s1.equals(s3));  //o/p:ture --this method will compare the content
        System.out.println(s5.equalsIgnoreCase(s6));  //o/p:ture  --this method will compare the content by ignoring case-sensitive
        System.out.println(s5==s6);  //o/p:false --because string is case-sensitive, so it will not allocate the same memory address to s6

        System.out.println(s1.equals(s3));  //o/p:ture --this method will compare the content
        System.out.println(s5.equalsIgnoreCase(s6));  //o/p:ture  --this method will compare the content by ignoring case-sensitive
        System.out.println(s5==s6);  //o/p:false --because string is case-sensitive, so it will not allocate the same memory address to s6*/

        //Methods in Strings
        /*
        * equals
        * equalsIgnoreCase
        * startWith
        * endWith
        * contains
        * concat
        * length
        * trim
        * toCharArray
        * toLowerCase
        * toUpperCase
        * indexOf
        * lastIndexOf
        * subString
        * split
        * charAt
        * replace
        * replaceFirst
        * replaceAll
        * valueOf
        * isEmpty
        * isBlank*/
        String s1 = "hello";
        String s2 = "world";
        String s3 = " hello ";
        String s4 = " hello world ";
        String s5 = " HELLO WORLD ";
        String s7 = "hello world";
        String s8 = "Hello world how are you guys";
        String s9 = "Hello^world ho^w are you guys";
        String s10 = "Hello guys. How are you guys?";
        String s11 = "9494202257";
        String s12;
        String s13 = "   ";
        String s14 = "";
        System.out.println(s1.contains("O"));   //o/p: true  --contains check 'o' is present in the string s1
        System.out.println(s1.concat(s2));     //o/p:"helloworld" --concat combines the two strings
        System.out.println(s1.concat(" welcome to java world"));
        System.out.println(s1.startsWith("h"));  //o/p: true  --because s1 starts with 'h'
        System.out.println(s2.endsWith("ho"));  //o/p: false  --because s2 does not end with 'h'
        System.out.println(s1.length());   //o/p:5 --length will give no.of characters in string s1
        System.out.println(s3.trim());     //trim will remove leading and trailing spaces in string
        System.out.println(s4.length());  //13
        System.out.println(s4.trim().length()); //removes leading and trailing spaces and prints the length
        System.out.println(s1.toUpperCase());   //o/p:"HELLO" --toUpperCase method will convert string to upper case
        System.out.println(s5.trim().toLowerCase());   //o/p:"hello world" --toLowerCase method will convert string to lower case and trim will remove all leading and trailing spaces
        System.out.println(s1.toCharArray());  //o/p:hello --but it converts our string to character array like [h,e,l,l,o] use debug mode to see the difference
        System.out.println(s1.indexOf("o"));   //o/p:4  --indexOf will print the index value of the first occurrence of the given character
        System.out.println(s1.lastIndexOf("l"));  //o/p:3  --lastIndexOf will print the index value of the last occurrence of the given character
        System.out.println(s7.substring(6)); //o/p:world  --substring will print the text from specified index number of a string
        System.out.println(s7.substring(2,8)); //o/p:llo wo  --substring will print the text from specified beginning index(2) number and ending index number(8) of a string  note:- the index values should be in the range of string, if we give wrong index numbers we will get runtime exception(StringIndexOutOfBoundsException)
        System.out.println(Arrays.toString(s8.split(" ")));  //o/p:[Hello, world, how, are, you, guys]   --split will separate the words based on the criteria we have given. Here the criteria is space(" ") and split will store the separated words in array of strings. so we are using Arrays.toString
        System.out.println(Arrays.toString(s9.split("\\^")));  //o/p:[Hello, world ho, w are you guys]]   --same as above, but for special characters we have to mention backslash(\\) to indicate that is a special character
        System.out.println(s1.charAt(4));  //o/p:o  --charAt will get the character at the given index number
        System.out.println(s8.replace("world","welcome")); //o/p:Hello welcome how are you guys doing    --replace method will replace the old word with new world
        System.out.println(s8.replaceAll("o", "O")); //0/p:HellO welcOme hOw are yOu guys dOing  --replaceAll method will replace all the occurrence of the old word with new world
        System.out.println(s10.replaceFirst("guys", "friends"));     //o/p: Hello friends. How are you guys?    --replaceFirst method will replace the first occurrence of the old word with new world
        System.out.println(Long.valueOf(s11));  //o/p:9494202257  --if the given string contains int or long data type, valueOf method will convert them to the int or long  and store the data in given datatype
        System.out.println(s14.isEmpty());  //o/p:true --isEmpty method checks the length of the string, returns only true if the length of the string is 0, that means initialized without any characters or spaces
        System.out.println(s13.isBlank());  //o/p:true --isBlank method will remove the spaces and checks any characters present in the string

    }
}

package com.java.stringbuilder;

public class Buffer {

    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer("Java");
        System.out.println(stringBuffer);     //output: Java
        stringBuffer.append("-world");       //output: Java-world
        System.out.println(stringBuffer);
        stringBuffer.insert(4," ");
        System.out.println(stringBuffer);  //output: Java -world
        stringBuffer.replace(6, 11, "Code");
        System.out.println(stringBuffer);    //output: Java -Code
        System.out.println(stringBuffer.length()); //output:10
        stringBuffer.delete(5,6);
        System.out.println(stringBuffer); //output: Java Code
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("012345678910");
        System.out.println(stringBuffer.length()); //output: 21
        System.out.println(stringBuffer.capacity()); //42
        StringBuilder stringBuilder = new StringBuilder(50);
        System.out.println(stringBuilder.capacity()); //output: 50
        String string = stringBuffer.toString(); // converting StringBuffer to string
        System.out.println(string);
    }
}

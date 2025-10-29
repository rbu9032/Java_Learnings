package com.java.typecast;

public class Implicit {

    public static void main(String[] args){
        byte b = 127;
        short s = b;
        s=12000;
        int i = s;
        long l =i;
        float f = 12.230f;
        double d = f;
        f=i;
        System.out.println("Byte: "+b); //Byte: 127
        System.out.println("Short: "+s); //Short: 12000
        System.out.println("Int: "+i);   //Int: 12000
        System.out.println("Long: "+l);   //Long: 12000
        System.out.println("float: "+f); //float: 12000.0
        System.out.println("Double: "+d); //Double: 12.229999542236328

    }
}

package com.java.patterns;

public class PatternProgram {
    public static void main(String[] args){
     /*   for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(j+" ");
            }
            System.out.println();

        }*/
        String company = "Frontlines Media";
        //System.out.println(company.charAt(0));
        for(int i =0; i<=company.length()-1; i++){
          System.out.println(company.charAt(i));
        }
    }
}

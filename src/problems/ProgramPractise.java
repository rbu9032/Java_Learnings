package problems;

import java.util.Scanner;

public class ProgramPractise {
    public static void main(String[] args){

        //program to count number of digits in a number Ex:input = 123, output = 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = sc.nextInt();
//        int count = 0;
//        while(x>0){
//        x = x/10;
//        count++;
//        }
//        System.out.println(count);

        //program to sum digits of a number Ex: input = 123 output=6 --1+2+3=6
        int y = 0;
        while(x>0){
            y = y+x%10;
            x = x/10;
        }
        System.out.println("Sum of digits: "+ y);
    }
}

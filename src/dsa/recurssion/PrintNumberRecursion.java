package dsa.recurssion;

public class PrintNumberRecursion {

    //Write a function to print 5 numbers and user will give a number
    //user --> n=1, o/p --> 1,2,3,4,5
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int n){
        //base condition 
        if(n==6){
            return;
        }
        //body of the program
        System.out.println(n);
        print(n+1);
    }
}

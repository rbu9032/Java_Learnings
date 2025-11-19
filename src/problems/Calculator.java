package problems;

public class Calculator {

    public static void main(String... args){
        Calculator calculator = new Calculator();
        calculator.sum(12,23);
        calculator.sum(12,23,56);
        calculator.sum(15,65,32,98,89);
    }

    public void sum(int a, int b){
        System.out.println(a+b);
    }
    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    //variable arguments
    public void sum(int... in){
        int sum = 0;
        for (int a: in){
           sum +=a;
        }
        System.out.println(sum);
    }
}

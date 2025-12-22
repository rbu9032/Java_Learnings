package dsa.recurssion;

public class SimpleProgram {

    public static void main(String[] args) {
        message1();
    }
    //Function to print some message
    public static void message1(){
        System.out.println("Hello-1");
        message2();
    }
    public static void message2(){
        System.out.println("Hello-2");
        message3();
    }
    public static void message3(){
        System.out.println("Hello-3");
        message4();
    }  public static void message4(){
        System.out.println("Hello-4");
        message5();
    }
    public static void message5(){
        System.out.println("Hello-5");
    }
}

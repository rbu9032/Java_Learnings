package com.java.practice;

public class Variables {

    int i =50;
    static int x = 34;
    static int z = 34232425;
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        /*
         * UserInput ui = new UserInput(); System.out.println(ui.i);
         */
        /*System.out.println(new Variables().i);
        System.out.println(x);
        test1(23);
        test1(1232);*/
//        new Variables().test2();
        Variables vi = new Variables();
        vi.test2();



    }
    public static void test1(int y) {
        System.out.println(x);
        System.out.println(y);
    }

    public  void test2() {
        int a1 = 23;
        System.out.println(z);
        System.out.println(a1);
    }
}

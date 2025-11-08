package com.java.abstraction.interfaceabstraction;

public class Main2{

    public static void main(String[] args){
          VI vi = new VI();
        //long num = vi.number()
        //System.out.println("VI num: "+num);
                System.out.println(vi.number());

        Uninor ui = new Uninor();
        long num2 = ui.number();
        System.out.println("Uninor num: "+num2);

        Sim sim = new VI();
        System.out.println(sim.number());

        Sim sim1 = new Uninor();
        System.out.println(sim.number());
        System.out.println(sim.a);
    }
}

package com.java8.functionalInterface;

@FunctionalInterface
public interface FunctionalInterfaces {
    void sayHi(); //only one abstract method

   default void hi(){
      System.out.println("This is default hi method from FunctionalInterface");  //you can have any no.of default method
   }

}

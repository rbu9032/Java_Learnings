package com.java.multilevel_inheritance;

//single Inheritance
/*
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark() {
        System.out.println("barking");
    }
}
*/

//Multilevel Inheritance
/*class Animal {
         void eat() {
             System.out.println("eat");
         }
     }
class Dog extends Animal{
     void bark(){
         System.out.println("bark");
     }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("weep");
    }
}*/
//Hierarchical Inheritance
class Animal{
    void eat(){
        System.out.println("eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("bark");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meow");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        /*Dog dog = new Dog();
        dog.eat();
        dog.bark();*/
       /* BabyDog bg = new BabyDog();
        bg.weep();
        bg.eat();
        bg.bark();*/
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}

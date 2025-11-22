package com.java8.optional;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        User user = new User(10,"Ram");
        User user1 = new User(11,null);
        Optional<String> email = user.getEmailById(12);
        email.ifPresentOrElse(e-> System.out.println(e),
                ()->System.out.println("No Value"));

        Optional<String> name = Optional.of("Ram");
        Optional<Integer> map = name.map(String::length);
        System.out.println(map.get());
    }
}

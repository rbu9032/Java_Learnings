package com.java.dice;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args){

        playGame();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        int initialScore = 0;
        System.out.println("Your starting score: " + initialScore);
        int temp;
        boolean keepPlaying = true;
        while (keepPlaying) {
            System.out.println("Enter 10 to roll the dice");
            int input = sc.nextInt();
            if(input == 10){
                Random random = new Random();
                temp = random.nextInt(1, 7);
                System.out.println("Dice value = "+temp);
                if (temp != 1) {
                    initialScore += temp;
                } else {
                    keepPlaying = false;
                    System.out.println("You are out of game");
                }
            }else {
                keepPlaying = false;
                System.out.println("Please enter 10 to play the game");
            }
        }
        System.out.println("Final Score: " + initialScore);

    }
}

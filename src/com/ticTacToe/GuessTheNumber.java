package com.ticTacToe;


import java.util.Random;
import java.util.Scanner;

class Game{

    int user=0;
    int random=0;
    int noOfGuesses=0;


    public Game(){
        Random ran = new Random();
        this.random=ran.nextInt(50);

    }
    void takeUserInput(int input){
        user=input;
    }
    boolean isCorrectNumber(){
        if(user>random) {
            System.out.println("Required number is less than your input!");
            noOfGuesses++;
            return false;

        } else if (user<random) {
            System.out.println("Required number is greater than your input!");
            noOfGuesses++;
            return false;
        } else {
            noOfGuesses++;
            return true;
        }
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Game game = new Game();
        System.out.println("Computer input:"+ game.random);
        boolean b=false;

        while(b==false) {
            int input= sc.nextInt();
            game.takeUserInput(input);
            b= game.isCorrectNumber();
        }
        System.out.println("You guessed the number correct!");
        System.out.println("Total no of guesses:"+ game.noOfGuesses);
    }
}

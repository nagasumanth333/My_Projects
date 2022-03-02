package com.ticTacToe;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        int user = 0;
        int cmp = 0;

         for(int i=0; i<5;i++) {

           Random random = new Random();
            int ran = random.nextInt(3);

            System.out.println("This is Computer input: " + ran);

            System.out.println("Enter a number\n 0== Scissors\n 1== Paper\n 2== Stone");

        Scanner sc = new Scanner(System.in);
         int input=0;
        int flag = 0;
        while (flag == 0) {
            int input1 = sc.nextInt();
            if (input1 < 0 || input1 > 2) {
                System.out.println("Enter number between 0 and 2");
            } else {
                flag = 1;
                input=input1;
            }

        }

           if (input == 0 && ran == 0 || input == 1 && ran == 1 || input == 2 && ran == 2) {
               System.out.println("This match has been deawn!");
            }
            if (input == 0 && ran == 1 || input == 1 && ran == 2 || input == 2 && ran == 0) {
                System.out.println("User Won this match!");
                user++;
            } else if (input == 1 && ran == 0 || input == 2 && ran == 1 || input == 0 && ran == 2) {

                System.out.println("Computer Won this match!");
                cmp++;
            }

        }

            if(user>cmp)
                System.out.println("User Wins the series !");
            else if(user<cmp){
                System.out.println("Computer Wins the series!");
            }else
                System.out.println("The series has been drawn!");

    }
}



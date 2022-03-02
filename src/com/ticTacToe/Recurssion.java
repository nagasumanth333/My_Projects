package com.ticTacToe;

import java.util.Scanner;

public class Recurssion {

    static void pattern(int n){
        if(n>0){
            for(int i=0; i<n;i++){
                System.out.print("*");

            }
            System.out.println();
             pattern(n-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        pattern(4);
    }
}

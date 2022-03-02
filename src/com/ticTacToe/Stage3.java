package com.ticTacToe;

import java.util.Scanner;

public class Stage3 {

    public static boolean xTester(String game){

        char[] ch = new char[game.length()];

        for (int i = 0; i < game.length(); i++) {
            ch[i] = game.charAt(i);
        }
        if((ch[0]=='X' && ch[1]=='X' && ch[2]=='X')|| (ch[3]=='X' && ch[4]=='X' && ch[5]=='X')
                || (ch[6]=='X' && ch[7]=='X' && ch[8]=='X'))
        {
            return true;
        } else if((ch[0]=='X' && ch[4]=='X' && ch[8]=='X')|| (ch[2]=='X' && ch[4]=='X' && ch[6]=='X'))
        {
            return true;
        }else if((ch[0]=='X' && ch[3]=='X' && ch[6]=='X')|| (ch[1]=='X' && ch[4]=='X' && ch[7]=='X')
                || (ch[2]=='X' && ch[6]=='X' && ch[8]=='X'))
        {
            return true;
        } else
            return false;
    }

    public static boolean oTester(String game){

        char[] ch = new char[game.length()];

        for (int i = 0; i < game.length(); i++) {
            ch[i] = game.charAt(i);
        }
        if((ch[0]=='O' && ch[1]=='O' && ch[2]=='O')|| (ch[3]=='O' && ch[4]=='O' && ch[5]=='O')
                || (ch[6]=='O' && ch[7]=='O' && ch[8]=='O'))
        {
            return true;
        } else if((ch[0]=='O' && ch[4]=='O' && ch[8]=='O')|| (ch[2]=='O' && ch[4]=='O' && ch[6]=='O'))
        {
            return true;
        }else if((ch[0]=='O' && ch[3]=='O' && ch[6]=='O')|| (ch[1]=='O' && ch[4]=='O' && ch[7]=='O')
                || (ch[2]=='O' && ch[6]=='O' && ch[8]=='O'))
        {
            return true;
        } else
            return false;
    }

    public static boolean checkDraw (String game){

        return !xTester(game) && !oTester(game);

    }

    public static boolean checkPossible(String game){

        char[] ch = new char[game.length()];

        int xCount=0;
        int yCount=0;
        int flag=0;

        for (int i = 0; i < game.length(); i++) {
            ch[i] = game.charAt(i);
            if (ch[i] == 'X')
                xCount++;
            else if (ch[i] == 'O')
                yCount++;
        }

        if((xCount==yCount) || (xCount==yCount+1) || ( yCount==xCount+1))
        {
            flag = 1;
            return true;
        }else
            return false;

    }

    public static boolean containsBlank(String game){

        char[] ch = new char[game.length()];

        for (int i = 0; i < game.length(); i++) {
            ch[i] = game.charAt(i);
            if(ch[i]=='_')
                return true;
        }
        return false;
    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String game= sc.nextLine();

         boolean poss=checkPossible(game);
        boolean blank=checkPossible(game);

        boolean xStatus= xTester(game);
        System.out.println(xStatus);

        boolean oStatus= oTester(game);
        System.out.println(xStatus);

        boolean drawStatus= checkDraw(game);
        System.out.println(drawStatus);

         if(!poss)
             System.out.println("Impossible");

         if(xStatus!=true && oStatus!=true && poss && blank)
             System.out.println("Game not finished");






      /*  System.out.println("---------");

        String sub1= game.substring(0,3);
        String s1= sub1.replace(""," ");
        String sub2= game.substring(3,6);
        String s2= sub2.replace(""," ");
        String sub3= game.substring(6,9);
        String s3= sub3.replace(""," ");
        System.out.println("|"+s1+"|");
        System.out.println("|"+s2+"|");
        System.out.println("|"+s3+"|");

        System.out.println("---------");

        */

    }
}

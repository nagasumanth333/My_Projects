package com.ticTacToe;



 class  Car{

    int c1;
    static int c2;


   public static void speed(){
        System.out.println("100");
    }
     static void brake(){
        System.out.println("stop");
    }

    void fuel(){
        System.out.println("full");
    }
        }

public class Testing {

     Car honda= new Car();

     int a;
     private int c;
     static int b;



    void method(){
         Car hero= new Car();
         hero.fuel();
         Car.speed();
         b=9;
         c=10;
         a=987;




     }


    public static void main(String[] args) {


        Car car= new Car();
        Car car1= new Car();


        car.fuel();
        Car.brake();
        Car.speed();
        car.c1=2;

        car1.c2=5;
        car.c2 =3;

        Testing test= new Testing();
        test.method();

        test.c=6;










    }
}

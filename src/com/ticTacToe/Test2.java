package com.ticTacToe;


class base{

    int n1=0;
    base(){
        System.out.println("no parameter in base1");
    }
    base(int n1){
        this.n1=n1;
        System.out.println("parameter in base1");
    }

}

class sub1 extends base{

    int n2=0;
    sub1(){
        System.out.println("no parameter sub1");
    }
    sub1(int n2){
        super(n2);
        this.n2=n2;
        System.out.println(" parameter in  sub1");
    }

}
class sub2 extends sub1{
    sub2(){
        super(5);
        System.out.println("no parameter sub1");
    }

}

public class Test2 {

    public static void main(String[] args) {


        sub2 obj= new sub2();
        System.out.println(obj.n1);
    }

}

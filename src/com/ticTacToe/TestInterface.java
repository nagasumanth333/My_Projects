package com.ticTacToe;

import org.w3c.dom.ls.LSOutput;

interface Parent2 {

    int num=8;
    void method3();
    void method4();

    default void method5(){
        System.out.println("This is a default method");
    }
}

class SubClass implements Parent2{

    @Override
    public void method3() {
        System.out.println("Implemented method3");
    }
    @Override
    public void method4() {
        System.out.println("Implemented method4");
    }
}

public class TestInterface {
    public static void main(String[] args) {

        Parent2 obj=new SubClass();
        //obj.num=10;
        obj.method3();
    }
}

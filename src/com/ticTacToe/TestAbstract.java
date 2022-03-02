package com.ticTacToe;

import org.w3c.dom.ls.LSOutput;

abstract class Parent{
     int a=9;
    abstract void method(int num);
    boolean method2(){
        System.out.println("Hello");
        return true;
    }
}
class Sub extends Parent{
    int n=0;
    @Override
    void method(int num) {
        System.out.println("Implemented in sub class");
    }
}
public class TestAbstract {
    public static void main(String[] args) {

      // Parent obj= new Sub();
        Sub obj= new Sub();
        obj.a=10;
        obj.n=98;
        System.out.println(obj.n);
        obj.method(5);
        obj.method2();
        System.out.println(obj.a);

    }

}

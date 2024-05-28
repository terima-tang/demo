package com.example.demo;
import java.lang.reflect.Method;
import entity.test;

public class demo {
    public static void main(String[] args) {
        test test1=new test();
        System.out.println(test1.a4);
        test1.setA3(11);
        System.out.println(test1.getA3());
    }
}

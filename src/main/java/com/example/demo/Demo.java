package com.example.demo;
import entity.Test;

public class Demo {
    public static void main(String[] args) {
        Test test1=new Test();
        System.out.println(test1.a4);
        test1.setA3(11);
        System.out.println(test1.getA3());
        String str= Son.testing();
        System.out.println(str);

    }

    public void output(){
        String str= Son.testing();
        System.out.println(str);
        System.out.println("测试");
    }
}

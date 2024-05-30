package com.example.demo;


//import com.sun.org.apache.xpath.internal.operations.String;
import entity.Test;

public class Son extends Test {


    //Test test=new Test();
   // System.out.println("123");


    @Override
    public void print() {
        super.print();

    }

   public static  String testing(){
        Test test = new Test();
        test.setA3(111);
       System.out.println(test.getA3());
        return "123";
}


    @Override
    public String printTest() {
        return null;
    }




}

package entity;

import com.example.demo.son;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public  class test {


    public Object obj;
    int a1;
    protected int a2;

    private int a3;

    public int a4;

    public test() {
    }

    public test(int a1, int a2, int a3, int a4) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getA3() {
        return a3;
    }

    public void setA3(int a3) {
        this.a3 = a3;
    }

    public int getA4() {
        return a4;
    }

    public void setA4(int a4) {
        this.a4 = a4;
    }

    public void print(){
        System.out.println("a1:"+a1+"a2:"+a2);

    }

    public Object print_test(){
        System.out.println("123");
        return null;
    }


;




}

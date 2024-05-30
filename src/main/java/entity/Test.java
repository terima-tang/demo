package entity;

public  class Test {

    public static final String MAX_SEX ="q妹";
    public Object obj;
    int a1;
    protected int a2;

    private int a3;

    public int a4;

    public Test() {
        System.out.println();
        //this(1,2,3,4);
    }



    public Test(int a1, int a2, int a3, int a4) {
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
        System.out.println("a1:"+a1+"a2:"+a2+MAX_SEX);

    }

    public static void main(String[] args) {
        System.out.println("测试test.java");
    }
    public Object printTest(){
        System.out.println("123");
        return null;
    }







}

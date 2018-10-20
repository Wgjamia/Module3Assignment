package com.edureka.co.exam;

class Counter{
    int count;
    static int sCont;
    Counter(){
        count=1;
        sCont=1;
    }
    void incrememntCount(){
        count++;
        sCont++;
    }
    void showCount(){
        System.out.println("count is:"+count);
        System.out.println("sCount is:"+sCont);
    }
}
public class StaticDemoAgain {
    public static void main(String[] args){


        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = c1;

        c1.incrememntCount();
        c2.incrememntCount();
        c3.incrememntCount();

        c2.incrememntCount();
        c3.incrememntCount();

        c2.incrememntCount();

        c1.showCount();
        c2.showCount();
        c3.showCount();

    }
}

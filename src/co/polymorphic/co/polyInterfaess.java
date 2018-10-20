package co.polymorphic.co;

interface Inf1{
    int i = 10;
    void show();

}
interface Inf2{
    void fun();
}
interface Inf3 extends Inf1,Inf2{

}
class CA implements Inf3{
    public void show(){
        System.out.println("Display Interface 1");
    }
    public void fun(){
        System.out.println("Display Interface 2");
    }
}

public class polyInterfaess {
    public static void main(String[] args){

        Inf3 i3 = new CA();
        i3.fun();
        i3.show();
        System.out.println("The Value of I is:" +i3.i);


    }
}

package co.polymorphic.co;
interface Inf1{
    int i = 10;
    void show();

}
interface Inf2{
    void fun();
}
class CA implements Inf1,Inf2{
    public void show(){
        System.out.println("Display Interface 1");
    }
    public void fun(){
        System.out.println("Display Interface 2");
    }
}

public class polyInterfaess {
    public static void main(String[] args){
        Inf2 i1 = new CA();

        ((CA) i1).fun();
    }
}

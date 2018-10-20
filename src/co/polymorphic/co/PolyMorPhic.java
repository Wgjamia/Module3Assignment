package co.polymorphic.co;

class Shape{

    Shape(){
        System.out.println("===== Shape Object Constructed ===");

    }
    void draw(){
        System.out.println("==== Drawing the Shape ====");

    }

}
class Circle extends Shape{

    Circle(){
        System.out.println("==== Circle object constructed =====");
    }
    //Overridden
    void draw(){
        System.out.println("Drawing the Circle");
    }
}

class Rectangle extends Shape{
    Rectangle(){
        System.out.println("==== Rectangle Object constructed  ====");
    }
    //Overridden
    void darw(){
        System.out.println("==== Drawing the Rectangle ====");

    }

}
class Triangle extends Shape{
    Triangle(){
        System.out.println("==== Triangle Object Constructed  ====");
    }

    //Overridden
    void draw(){
        System.out.println("Drawing the Triangle");
    }

}

public class PolyMorPhic {
    PolyMorPhic(){
        System.out.println("This Constructed");
    }
    {
        System.out.println("Hi Block");
    }
    static {
        System.out.println("This Block inition with Class");
    }
    public static void main(String[] args){


      //  PolyMorPhic r = new PolyMorPhic();

      /*  Shape s;
        s = new Rectangle();
        ((Rectangle) s).darw();
        s = new Triangle();
        s.draw();
        s = new Circle();
        s.draw();*/

    }
}

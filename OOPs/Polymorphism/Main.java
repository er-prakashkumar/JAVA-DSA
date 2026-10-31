package Polymorphism;

public class Main {
    public static void main(String[] args) {
    Calculator c = new Calculator();
    System.out.println(c.add(2,3));
    System.out.println(c.add(2,3,4));
    System.out.println(c.add(2,3,4,5.6));

    // Runtime Polymorphism
    Circle cr = new Circle();
    cr.draw();
    doDrawingStuff(cr); // Upcasting 

    Rect r = new Rect();
    r.draw();
    doDrawingStuff(r);

    doDrawingStuff(new Shape());

    }

    public static void doDrawingStuff(Shape s){
        s.draw();
    }
}
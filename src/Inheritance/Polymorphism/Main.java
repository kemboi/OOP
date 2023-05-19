package Inheritance.Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("Polymorphism: Function overriding example");
        Shapes shapes = new Shapes();
        shapes.area();
        Shapes circle = new Circle(10);
        circle.area();
        Shapes square = new Square(10,10);
        square.area();
    }
}

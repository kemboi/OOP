package Inheritance.Polymorphism;

public class Circle extends Shapes{
    int r;
    final double pie = 3.14;
    public Circle(int r) {
        this.r = r;
    }

    @Override
    void area() {
        System.out.println("Area of a circle is Pie r * r: "+ this.r * this.pie * this.r);
    }
}

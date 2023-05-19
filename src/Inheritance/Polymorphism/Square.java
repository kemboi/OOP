package Inheritance.Polymorphism;

public class Square extends Shapes{
    public Square(int l, int w) {
        super(l, w);
    }

    @Override
    void area() {
        System.out.println("Area of a Square is l * l : "+ super.l * super.w);
    }
}

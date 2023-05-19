package Inheritance.Polymorphism;

public class Shapes {
    int l;
    int w;
    Shapes(){
    }

    public Shapes(int l, int w) {
        this.l = l;
        this.w = w;
    }

    void area(){
        System.out.println("Area of a shape");
    }
}

package Inheritance.Polymorphism;

public class Shapes {
    int l;
    int w;
    private static final double PIE = 3.14;
public double getPie(){
    return PIE;
}
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

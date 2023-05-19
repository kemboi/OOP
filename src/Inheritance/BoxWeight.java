package Inheritance;

public class BoxWeight extends Box{
    int weight;

    public BoxWeight(int weight) {
        this.weight = weight;
    }

    /**
     * BoxWeight - constructor overloading
     * An example of polymorphism in java
     * @param l
     * @param w
     * @param h
     * @param weight
     */
    public BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h);
        this.weight = weight;
    }

    public BoxWeight(Box other, int weight) {
        super(other);
        this.weight = weight;
    }
}

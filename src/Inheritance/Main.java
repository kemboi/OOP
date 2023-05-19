package Inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Box box = new Box();
        BoxWeight boxweight = new BoxWeight(box,10);
        System.out.println(boxweight.weight);
    }
}
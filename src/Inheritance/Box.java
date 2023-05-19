package Inheritance;

public class Box {
    int l;
    int w;
    int h;
    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    // copy constructor
    Box(Box other){
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;
    }
}

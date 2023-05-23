package Generics;

public class T <U> {
    U object;
    public T(U obj){
        this.object = obj;
    }
    public T(){}
    public U getObject(){
        return this.object;
    }

    @Override
    public String toString() {
        return "T{" +
                "object=" + object +
                '}';
    }
}

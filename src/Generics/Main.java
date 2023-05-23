package Generics;

public class Main {
    public static void main(String[] args) {
        T<Integer> obj = new T<>(9);
        T<String> objString = new T<>("Hello World");
        System.out.println(objString.object);
        KV[] test = new KV[2];
        KV<String,Integer> kv = new KV<>("Evans",10);
        KV<String,Integer> kv2 = new KV<>("Titus",obj.getObject());
        test[0] = kv;
        test[1] = kv2;
        for(KV k : test)
        System.out.println(k.getKey() + " : "+ k.getValue());

    }
}

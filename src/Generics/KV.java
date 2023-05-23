package Generics;

public class KV <K,V> extends T{

    V value;


    public KV( K key, V value) {
        super(key);
        this.value = value;
    }
    public KV(){
        super();
    }

    public K getKey() {
        return (K) super.object;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

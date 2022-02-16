package Generic;

public class GenericClass<K, V> {
    private K key;
    private V value;

    public GenericClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public GenericClass() {
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

class DemoGeneric {
    public static void main(String[] args){
        GenericClass<Integer, String> Book = new GenericClass<Integer, String>();

        Book.setKey(1);
        Book.setValue("Java");

        System.out.print(Book);
    }
}

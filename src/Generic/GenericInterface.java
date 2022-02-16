package Generic;

public interface GenericInterface<T> {
    void add(T String);

}

class Book<T> implements GenericInterface {

    @Override
    public void add(Object String) {
        System.out.println(String);
    }
}

class Demo {
    public static void main(String[] args){
        Book<String> book = new Book<>();
        book.add("Hello");
        book.add("How are you?");
    }
}
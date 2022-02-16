package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollections {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("chuoi 1");
        list.add("chuoi 2");
        list.add("chuoi 3");


        List<String> listLinked = new LinkedList<>();
        listLinked.addAll(list);
        listLinked.remove(1);
        System.out.print(listLinked.get(1));
    }

}

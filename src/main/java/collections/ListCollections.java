package collections;

import java.util.*;

public class ListCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("chuoi 1");
        list.add("chuoi 2");
        list.add("chuoi 3");
        System.out.println(list.indexOf("chuoi 1"));

        List<String> listLinked = new LinkedList<>();
        listLinked.addAll(list);

        List<String> list2 = new ArrayList<>();

        list2.add(0, "chuoi 4");

        list2.addAll(list);

        System.out.println(list2);
        System.out.println(list);

        System.out.println(list2.indexOf("chuoi 4"));

        list2.removeAll(list);
        System.out.println(list2);

        Iterator<String> listI = list.iterator();

        while (listI.hasNext()) {
            System.out.print(listI.next());
        }

        List<String> list3 = new ArrayList<>();
        System.out.println(list3.contains("chuoi 1"));

        list.remove(1);
        System.out.println(list.get(1));


        listLinked.remove(1);

        System.out.println(listLinked.get(1));

        listLinked.clear();
        System.out.println(listLinked);


    }

}

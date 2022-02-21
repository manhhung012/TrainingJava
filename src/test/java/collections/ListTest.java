package collections;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListTest {
    private static List<String> list = new ArrayList<>();

    @BeforeClass
    public static void setUp() {
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
    }

    @Test
    public void testAdd() {
        list.add("String 1");
        assertEquals("String 1", list.get(0));
    }

    @Test
    public void testGet() {
        assertEquals("String 1", list.get(0));
        assertEquals("String 2", list.get(1));
        assertEquals("String 3", list.get(2));

    }

    @Test
    public void testSize() {
        assertEquals(3, list.size());
    }

    @Test
    public void testAddAll() {
        List<String> listTemp = new ArrayList<>();
        list.addAll(listTemp);

        assertEquals(listTemp, list);
    }

    @Test
    public void testRetainAll() {
        List<String> listTemp = new ArrayList<>();
        listTemp.add("String 3");

        list.retainAll(listTemp);

        assertEquals(1, list.size());
        assertEquals("String 3", list.get(0));
    }

    @Test
    public void testRemoveAll() {
        List<String> listTemp = new ArrayList<>();
        listTemp.add("String 3");

        list.removeAll(listTemp);

        assertEquals(2, list.size());
        assertEquals("String 1", list.get(0));
        assertEquals("String 2", list.get(1));
    }

    @Test
    public void testIndexOf() {
        assertEquals(2, list.indexOf("String 3"));
    }

    @Test
    public void testLastIndexOf() {
        list.add("String 1");
        assertEquals(3, list.lastIndexOf("String 1"));
    }

    @Test
    public void testToArray() {
        String[] arrayTemp = {"String 1", "String 2", "String 3"};

        String[] array = list.toArray(new String[0]);
        assertEquals(arrayTemp.length, array.length);
        for (int i = 0; i < array.length; i++) {
            assertEquals("" + i, arrayTemp[i], array[i]);
        }
    }

    @Test
    public void testClear() {

        list.clear();

        assertEquals(0, list.size());
    }

    @Test
    public void testContains() {
        assertTrue(list.contains("String 1"));
    }

    @Test
    public void testContainsAll() {
        List<String> listTemp = new ArrayList<>();
        listTemp.add("String 1");
        listTemp.add("String 2");
        listTemp.add("String 3");

        assertTrue(list.containsAll(listTemp));
    }


}
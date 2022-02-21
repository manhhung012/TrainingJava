package collections;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetTest {

    private static Set<String> set = new HashSet<>();

    @BeforeClass
    public static void setUp() {
        set.add("set 1");
        set.add("set 2");
        set.add("set 3");
    }
    //Test các phương thức khác với List

    @Test
    public void testHasdCodeAndEquals(){
        Set<String> setTemp = new HashSet<>();
        setTemp.add("set 1");
        setTemp.add("set 2");
        setTemp.add("set 3");

        assertEquals(true,set.equals(setTemp));

        assertEquals(setTemp.hashCode(),set.hashCode());
    }

    @Test
    public void testRemove(){
        set.remove("set 1");

        assertFalse(set.contains("set 1"));
    }

    @Test
    public void testIterator(){
        Iterator iterator = set.iterator();

        assertTrue(iterator.hasNext());
        assertEquals("set 2",iterator.next());
    }
}
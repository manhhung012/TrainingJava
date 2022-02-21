package collections;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapTest {

    private static Map<Integer, String> map = new HashMap<>();

    @BeforeClass
    public static void setUp(){
        map.put(1,"Map 1");
        map.put(2,"Map 2");
        map.put(3,"Map 3");
    }

    @Test
    public void testRemokey(){
        assertEquals("Map 1",map.remove(1));
        assertEquals(2,map.size());

    }

}
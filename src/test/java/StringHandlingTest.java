import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Locale;

import static org.junit.Assert.*;

public class StringHandlingTest {
    public String str = new String("PhamManhHung");

    @Test
    public void testCharAt(){
        assertEquals('m',str.charAt(3));
    }

    @Test
    public void testCodePointAt(){
        assertEquals(97,str.codePointAt(2));
    }

    @Test
    public void testCompareTo(){
        assertEquals(32,str.compareTo("PHAM"));
    }

    @Test
    public void testConcat(){
        assertEquals("PhamManhHung0509",str.concat("0509"));
    }

    @Test
    public void testContains(){
        assertEquals(true,str.contains("Manh"));
    }

    @Test
    public void testContentEquals(){
        assertEquals(true,str.contentEquals("PhamManhHung"));
    }

    @Test
    public void testHashCode(){
        assertEquals(-1595179176,str.hashCode());
    }

    @Test
    public void testIndexOfChar(){
        assertEquals(6,str.indexOf('n'));
    }

    @Test
    public void testIndexOfString(){
        assertEquals(8,str.indexOf("Hung"));
    }

    @Test
    public void testIndexOfFrom(){
        assertEquals(-1,str.indexOf('a'),5);
    }

    @Test
    public void testLastIndexOf(){
        assertEquals(10,str.lastIndexOf('n'));
    }

    @Test
    public void testIsEmpty(){
        assertFalse(str.isEmpty());
    }

    @Test
    public void testStartWith(){
        assertTrue(str.startsWith("Pham"));
    }

    @Test
    public void testSubString(){
        assertEquals("ManhHung",str.substring(4));
    }

    @Test
    public void testSubString2(){
        assertEquals("Manh",str.substring(4,8));
    }

    @Test
    public void testTrim(){
        String strTest = " " +str+" ";
        assertEquals("PhamManhHung",strTest.trim());
    }

    @Test
    public void testToUpperCase(){
        assertEquals("PHAMMANHHUNG",str.toUpperCase());
    }

    @Test
    public void testToLowerCase(){
        assertEquals("phammanhhung",str.toLowerCase());
    }

    @Test
    public void testStringValueOf(){
        Integer longTest = 123456;
        assertEquals("123456",String.valueOf(longTest));
    }

}
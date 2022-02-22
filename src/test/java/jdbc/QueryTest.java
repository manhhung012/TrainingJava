package jdbc;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class QueryTest {

    @Test
    public void testGetAllUser() {

        List<User> list = Query.getAllUser();

        assertFalse(list.isEmpty());
    }

    @Test
    public void testGetUserByID() {
        User u = Query.getUserById(19);

        assertEquals(19, u.getId());
        assertEquals("Phong", u.getFullName());
        assertEquals("87896s", u.getPhone());
    }

    @Test
    public void testAddAUser() {
        int id = 23;
        String name = "Hai";
        String phone = "0817953779";
        User u = new User(id, name, phone);

        Query.addUser(u);

        User uTest = Query.getUserById(23);

        assertEquals(id, u.getId());
        assertEquals(name, u.getFullName());
        assertEquals(phone, u.getPhone());
    }

}
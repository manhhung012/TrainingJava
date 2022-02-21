package extend;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void checkStudy() {
        Student s = new Student();

        String study = s.study(80, 50, 80, s.getUp(true));
        String eat = s.study(80, 40, 80, s.getUp(true));
        String off = s.study(80, 60, 60, s.getUp(false));

        assertEquals("Go to",study);
        assertEquals("Eating",eat);
        assertEquals("Offline", off);
    }

    @Test
    public void checkRun(){
        Student s = new Student();

        String run = s.run();

        assertEquals("Runing",run);

        s.setHp(20);
        s.setHp(20);

        String stop = s.run();

        assertEquals("Stop",stop);

    }

}
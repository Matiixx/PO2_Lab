import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieTest {
    @Test
    public void TestConstructor() {
//        Movie m1 = new Movie(-1, "", "Dir");

        Movie m2 = new Movie(12, "Dir", "Dir");
        Movie m3 = new Movie(12, "Dir", "Dir");
        Assertions.assertNotNull(m2);
        Assertions.assertNotNull(m2.getDuration());
        Assertions.assertTrue(m2.getDuration() > 0);
        Assertions.assertFalse(m2.toString().equals("Dir 12 Dir"));
        Assertions.assertTrue(m2.toString().equals("Dir,12,Dir"));
        Assertions.assertSame(m2.getDirector(), "Dir");
        Assertions.assertEquals(m2.toString(), m3.toString());
    }

    @Test
    public void TestLength() {
        Movie m2 = new Movie(12, "Title", "Dir");
        Assertions.assertEquals(m2.length("director"), 3);
        Assertions.assertEquals(m2.length("title"), 5);
        Assertions.assertEquals(m2.length("duration"), 4);
    }

}
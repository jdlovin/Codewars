import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTests {
    @Test
    public void basicTests() {
        assertEquals(true, Kata3.smallEnough(new int[] { 66, 101 }, 200));
        assertEquals(false, Kata3.smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100));
        assertEquals(true, Kata3.smallEnough(new int[] { 101, 45, 75, 105, 99, 107 }, 107));
        assertEquals(true, Kata3.smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));
    }
}

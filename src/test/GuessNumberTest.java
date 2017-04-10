import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by qiuyf on 17-4-10.
 */
public class GuessNumberTest {
    GuessNumber guessNumber;
    @Before
    public void setUp() {
        guessNumber = new GuessNumber();
    }

    @Test
    public void genarateRandomNumberTest() {
        int number = guessNumber.genarateRandomNumber(1, 100);
        assertNotNull(number);
    }

    @Test
    public void calCountTest() {
        int count = guessNumber.calCount(3);
        assertEquals(count, 4);
    }

    @Test
    public void compareNumberTest() {
        String msg = guessNumber.compareNumber(3, 4);
        assertSame(msg, "猜小了");
    }
}
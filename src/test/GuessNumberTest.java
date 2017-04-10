import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void compareNumberSmallTest() {
        String msg = guessNumber.compareNumber(3, 4);
        assertSame(msg, "猜小啦");
    }
    @Test
    public void compareNumberBigTest() {
        String msg = guessNumber.compareNumber(5, 4);
        assertSame(msg, "猜大啦");
    }

    @Test
    public void compareNumberEqualTest() {
        String msg = guessNumber.compareNumber(4, 4);
        assertSame(msg, "猜中啦");
    }
    @Test
    public void isExcessCountTest() {
        boolean isExcessCount = guessNumber.isExcessCount(6);
        assertEquals(isExcessCount, true);
    }

    @Test
    public void isExcessCountSmallTest() {
        boolean isExcessCount = guessNumber.isExcessCount(4);
        assertEquals(isExcessCount, false);
    }
    @After
    public void setDown() {
        guessNumber = null;
    }
}
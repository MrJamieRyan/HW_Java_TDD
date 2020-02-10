import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    private Bottle bottle;

    @Before
    public void before() {
        bottle = new Bottle(100);
    }

    @Test
    public void has_contents() {
        assertEquals(100, bottle.getContents());
    }

    @Test
    public void check_content_reduces() {
        assertEquals(90, bottle.drink());
    }

    @Test
    public void check_bottle_empties() {
        assertEquals(0, bottle.empty());
    }

    @Test
    public void refill_bottle() {
        assertEquals(100, bottle.refill());
    }




}

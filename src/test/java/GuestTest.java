import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Andrew", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Andrew", guest.getName());
    }

    @Test
    public void hasPartySize(){
        assertEquals(2, guest.getPartySize());
    }
}

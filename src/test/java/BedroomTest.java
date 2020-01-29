import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 1, "double");

    }


    @Test
    public void hasCapacity(){
     assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }
}

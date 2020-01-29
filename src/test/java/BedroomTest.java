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
    public void roomHasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void roomHasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.getRoomGuestCount());
    }

    @Test
    public void roomHasType(){
        assertEquals("double", bedroom.getRoomType());
    }
}

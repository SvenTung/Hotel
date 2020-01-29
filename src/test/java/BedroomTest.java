import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 1, "double", 12.00);
        guest = new Guest("Andrew", 2);
    }


    @Test
    public void roomHasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void roomHasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

//    @Test
//    public void roomStartsEmpty(){
//        assertEquals(0, bedroom.getRoomGuestCount());
//    }

    @Test
    public void roomHasType(){
        assertEquals("double", bedroom.getRoomType());
    }

//    @Test
//    public void canAddGuest() {
//        bedroom.addGuest(guest);
//        assertEquals(1, bedroom.getRoomGuestCount());
//    }

//    @Test
//    public void canRemoveGuest() {
//        bedroom.addGuest(guest);
//        assertEquals(1, bedroom.getRoomGuestCount());
//        assertEquals(true, bedroom.removeGuest(guest));
//    }

    @Test
    public void canGetRate() {
        assertEquals(12.00, bedroom.getRate(), 0.01);
    }
}

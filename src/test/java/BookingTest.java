import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, "single", 12.00);
        guest = new Guest("Sven", 1);
        booking = new Booking(bedroom, 5, guest);
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void getNights(){
        assertEquals(5, booking.getNights());
    }

    @Test
    public void canGetFee(){
        assertEquals(60.00, booking.getFee(), 0.01);
    }

}

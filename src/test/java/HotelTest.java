import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        hotel = new Hotel("Tech Towers", "1 Electronic Avenue");
        bedroom = new Bedroom(1, 2, "double");
        conferenceRoom= new ConferenceRoom(12, "Turing");
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom);
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addConferenceRoom(conferenceRoom);
    }

    @Test
    public void hasName(){
        assertEquals("Tech Towers", hotel.getName());
    }

    @Test
    public void hasAddress(){
        assertEquals("1 Electronic Avenue", hotel.getAddress());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(2, hotel.countBedrooms());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(2, hotel.countConferenceRooms());
    }
}

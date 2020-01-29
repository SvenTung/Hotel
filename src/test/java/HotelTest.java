import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("Tech Towers", "1 Electronic Avenue");
        bedroom = new Bedroom(1, 2, "double", 12.00);
        conferenceRoom= new ConferenceRoom(12, "Turing");
        guest = new Guest("Andrew", 2);
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

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(3, hotel.countBedrooms());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(3, hotel.countConferenceRooms());
    }

    @Test
    public void canCheckGuestIntoConferenceRoom(){
        assertEquals("Transaction complete", hotel.checkGuestIntoConferenceRoom(guest, conferenceRoom));
    }

    @Test
    public void canCheckGuestOutOfConferenceRoom(){
        hotel.checkGuestIntoConferenceRoom(guest, conferenceRoom);
        assertEquals("Guest removed", hotel.checkGuestOutOfConferenceRoom(guest, conferenceRoom));
    }

    @Test
    public void cannotCheckGuestOutOfConferenceRoom(){
        assertEquals("This guest is not in room", hotel.checkGuestOutOfConferenceRoom(guest, conferenceRoom));
    }

    @Test
    public void canBookRoom(){
        Booking newBooking = hotel.bookRoom(bedroom, 5, guest);
        assertNotNull(newBooking);
    }

    @Test
    public void canReturnVacantBedrooms(){
        ArrayList<Bedroom> expectedArrayList = new ArrayList<>();
        expectedArrayList.add(bedroom);
        expectedArrayList.add(bedroom);
        assertEquals(expectedArrayList, hotel.checkVacancy());
    }
}

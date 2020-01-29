import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(12, "Turing");
    }

    @Test
    public void hasCapacity(){
        assertEquals(12, conferenceRoom.getCapacity());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, conferenceRoom.countGuests());
    }

    @Test
    public void hasName(){
        assertEquals("Turing", conferenceRoom.getName());
    }


}

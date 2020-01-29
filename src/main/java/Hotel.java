import java.util.ArrayList;

public class Hotel {

    private String name;
    private String address;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> bedrooms;


    public Hotel(String name, String address) {
        this.name = name;
        this.address = address;
        this.conferenceRooms = new ArrayList<>();
        this.bedrooms = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }
}

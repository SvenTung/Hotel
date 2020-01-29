import java.util.ArrayList;

public class Hotel {

    private String name;
    private String address;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Booking> bookingsList;


    public Hotel(String name, String address) {
        this.name = name;
        this.address = address;
        this.conferenceRooms = new ArrayList<>();
        this.bedrooms = new ArrayList<>();
        this.bookingsList = new ArrayList<>();
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

    public String checkGuestIntoConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
        return "Transaction complete";
    }


    public String checkGuestOutOfConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        if (conferenceRoom.removeGuest(guest)) {
            return "Guest removed";
        }
        return "This guest is not in room";
    }

    public Booking bookRoom(Bedroom bedroom, int nights, Guest guest) {
        if (bedroom.getBooked()){
       //     search through booking list to find booking for bedroom
            for (Booking booking: bookingsList){
                if (booking.getBedroom() == bedroom){
                    return booking;
                }
            }
        }
        Booking booking = new Booking(bedroom, nights, guest);
        this.bookingsList.add(booking);
        return booking;
    }

    public ArrayList<Bedroom> checkVacancy() {
        ArrayList<Bedroom> vacantBedrooms = new ArrayList<>();
        for (Bedroom bedroom: this.bedrooms){
            if (bedroom.getBooked() == false){
                vacantBedrooms.add(bedroom);
            }
        }
        return vacantBedrooms;
    }
}

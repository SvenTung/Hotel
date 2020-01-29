import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(int capacity, String name) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int countGuests() {
        return this.guests.size();
    }

    public String getName() {
        return name;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public Boolean removeGuest(Guest guest) {
        return this.guests.remove(guest);
    }
}

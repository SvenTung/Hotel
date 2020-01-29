import java.util.ArrayList;

public class Bedroom {

    private int capacity;
    private int roomNumber;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(int capacity, int roomNumber, String type) {
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.guests = new ArrayList<>();
        this.type = type;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }
}

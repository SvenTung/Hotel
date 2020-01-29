import java.util.ArrayList;

public class Bedroom {

    private int capacity;
    private int roomNumber;
    private String type;
    private boolean booked;
    private double rate;

    public Bedroom(int capacity, int roomNumber, String type, double rate) {
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.type = type;
        this.booked = false;
        this.rate = rate;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public String getRoomType(){
        return this.type;
    }

    public double getRate() {
        return this.rate;
    }

    public boolean getBooked() {
        return this.booked;
    }
}

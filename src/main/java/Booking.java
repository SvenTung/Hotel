public class Booking {

    private Bedroom bedroom;
    private int nights;
    private Guest guest;

    public Booking(Bedroom bedroom, int nights, Guest guest) {
        this.bedroom = bedroom;
        this.nights = nights;
        this.guest = guest;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getNights() {
        return nights;
    }

    public double getFee() {
       return this.bedroom.getRate() * this.nights;
    }
}

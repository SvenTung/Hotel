public class Guest {

    private String name;
    private int partySize;

    public Guest(String name, int partySize) {
        this.name = name;
        this.partySize = partySize;
    }

    public String getName() {
        return name;
    }

    public int getPartySize(){
        return this.partySize;
    }
}

package hotel;

public abstract class Room {
    protected int roomNumber;
    protected double pricePerDay;
    protected boolean available = true;

    public Room(int roomNumber, double pricePerDay) {
        this.roomNumber = roomNumber;
        this.pricePerDay = pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void book() {
        available = false;
    }

    public void free() {
        available = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public abstract String getRoomType();
}

package hotel;

public class Booking {
    private static int counter = 1;

    private int bookingId;
    private Customer customer;
    private Room room;
    private int days;
    private double totalAmount;

    public Booking(Customer customer, Room room, int days) {
        this.bookingId = counter++;
        this.customer = customer;
        this.room = room;
        this.days = days;
        this.totalAmount = days * room.getPricePerDay();
        room.book();
    }

    public int getBookingId() { return bookingId; }
    public Customer getCustomer() { return customer; }
    public Room getRoom() { return room; }
    public double getTotalAmount() { return totalAmount; }
}

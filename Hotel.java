package hotel;

import java.util.*;

public class Hotel implements HotelService {

    private List<Room> rooms = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private int customerCounter = 1;

    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public void viewAvailableRooms() {
        for (Room r : rooms) {
            if (r.isAvailable()) {
                System.out.println(r.getRoomType() +
                        " Room | No: " + r.getRoomNumber() +
                        " | Price/Day: ₹" + r.getPricePerDay());
            }
        }
    }

    @Override
    public void bookRoom(String customerName, String roomType, int days) {

        Customer customer = new Customer(customerCounter++, customerName);

        for (Room r : rooms) {
            if (r.isAvailable() && r.getRoomType().equalsIgnoreCase(roomType)) {

                Booking booking = new Booking(customer, r, days);
                bookings.add(booking);

                System.out.println("Booking Successful!");
                System.out.println("Customer Name: " + customer.getName());
                System.out.println("Booking ID: " + booking.getBookingId());
                System.out.println("Total Bill: ₹" + booking.getTotalAmount());
                return;
            }
        }
        System.out.println("No available rooms of this type.");
    }

    @Override
    public void cancelBooking(int bookingId) {
        Iterator<Booking> it = bookings.iterator();
        while (it.hasNext()) {
            Booking b = it.next();
            if (b.getBookingId() == bookingId) {
                b.getRoom().free();
                it.remove();
                System.out.println("Booking cancelled successfully.");
                return;
            }
        }
        System.out.println("Booking ID not found.");
    }

    @Override
    public void showBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No active bookings.");
            return;
        }

        for (Booking b : bookings) {
            System.out.println(
                "Booking ID: " + b.getBookingId() +
                " | Customer: " + b.getCustomer().getName() +
                " | Room: " + b.getRoom().getRoomType() +
                " | Room No: " + b.getRoom().getRoomNumber() +
                " | Amount: ₹" + b.getTotalAmount()
            );
        }
    }
}

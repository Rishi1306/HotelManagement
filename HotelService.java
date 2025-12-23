package hotel;

public interface HotelService {
    void viewAvailableRooms();
    void bookRoom(String customerName, String roomType, int days);
    void cancelBooking(int bookingId);
    void showBookings();
}

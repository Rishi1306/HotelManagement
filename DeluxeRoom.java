package hotel;

public class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber) {
        super(roomNumber, 3500);
    }

    @Override
    public String getRoomType() {
        return "Deluxe";
    }
}

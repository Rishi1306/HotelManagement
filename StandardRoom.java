package hotel;

public class StandardRoom extends Room {
    public StandardRoom(int roomNumber) {
        super(roomNumber, 2000);
    }

    @Override
    public String getRoomType() {
        return "Standard";
    }
}

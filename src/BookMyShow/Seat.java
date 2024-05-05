package BookMyShow;

public class Seat {
    int SeatId;
    SeatCategory seatCategory;
    int row;
    boolean BookingStatus;
    public int getSeatId() {
        return SeatId;
    }

    public void setSeatId(int seatId) {
        SeatId = seatId;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}

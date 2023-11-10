public class Reservation{
    private String guestName;
    private int roomNumber;

    public Reservation(String guestName, int roomNumber){
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }

    public void setGuestName(String name){
        this.guestName = name;
    }

    public void setRoomNumber(int number){
        this.roomNumber = number;
    }

    public String getGuestName(){
        return this.guestName;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public String toString(){
        return guestName;
    }
}

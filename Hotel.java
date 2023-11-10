public class Hotel{
    private Reservation[] rooms;
    /*
     * Each element corresponds to a room in the hotel;
     * If room[index] is null, the room is empty
     * Otherwise, it contains a reference to the Reservation
     * For that room, such that rooms[index].getRoomNumber returns index
     */

    private ArrayList<String> waitList;
     /*
      * Contains names of guest who have not yet been
      * Assigned a room because all rooms are full
      */

    public Hotel(int numRooms){
        this.rooms = Reservation[numRooms];
        this.waitList = new ArrayList<String>();
    }

    /*
     * If there are any empty rooms (rooms with no reservation)
     * then create a reservation for an empty room for the 
     * specified guest and return the new Reservation;
     * otherwise, add the guest to the end of the waitlist and
     * return null.
     */
    public Reservation requestRoom(String guestName){
        /*to be implemented in part (a) */
    }

    /*
     * Release the room associated with parameter res, effectively
     * canceling the reservation;
     * If any names are stored in waitList, remove the first name
     * and create a Reservation for this person in the room
     * reserved by res; return that new Reservation;
     * if waitList is empty, mark the room specified by res as empty and
     * return null
     * precondition: res is a valid Reservation for some room
     *              in this hotel
     */
    public Reservation cancelAndReassign(Reservation res){
        /* to be implemented in part (b) */
    }
}

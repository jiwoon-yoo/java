package yourturn3bcomplete;

import java.util.HashMap;

public class HotelManager {
    private HashMap<Integer, Guest> guests = new HashMap<>();


    public String assignGuestToRoom(Guest guest, int room)
    {
        if (guests.containsKey(room)) {
            return "Sorry - " + guests.get(room).getName() + " is already checked into room "+room;
        }
        guests.put(room, guest);
        return guest.getName() + " has been checked into room " + room;
    }
    
    public String checkOut (int room)
    {
        if (!guests.containsKey(room)) {
            return "Sorry, there is no guest currently checked into room "+room;
        }
        Guest guest = guests.get(room);
        guests.remove(room);
        String returnValue = guest.getName() + " is checking out of room " + room + "\n";
        return returnValue + guest.getRoomCharges();

    }
    
    public String addRoomCharge (int room, RoomCharge charge)
    {
        if (!guests.containsKey(room)) {
            return "Sorry, no guest in room: "+room;
        }
        guests.get(room).addroomCharge(charge);
        return "room charge applied to "+guests.get(room).getName()+" in room "+room;
    }
}

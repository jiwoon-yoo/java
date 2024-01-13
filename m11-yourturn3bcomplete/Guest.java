package yourturn3bcomplete;

import java.util.ArrayList;

public  class Guest {
    private String name;
    private ArrayList<RoomCharge> roomCharges = new ArrayList<>();

    public Guest(String name) {
        this.name = name;
    }

    public void addroomCharge(RoomCharge roomCharge) {
        roomCharges.add(roomCharge);
    }

    public String getName() {
        return name;
    }

    public String getRoomCharges ()
    {
        if (roomCharges.size() == 0) {
            return "No Room Charges\n";
        }
        String returnValue = "Room Charges:\n";
        for (RoomCharge roomCharge : roomCharges) {
            returnValue += String.format("  %-20s %-6s\n", roomCharge.getDescription(), ""+roomCharge.getCost());
        }
        return returnValue;
    }

}

package yourturn3bcomplete;

public class Start {
    public static void main (String [] args)
    {
        HotelManager hotel = new HotelManager();
        System.out.println(hotel.assignGuestToRoom(new Guest("Rich"), 1));
        System.out.println(hotel.assignGuestToRoom(new Guest("Lori"), 1));
        System.out.println(hotel.assignGuestToRoom(new Guest("Lori"), 2));
        System.out.println(hotel.assignGuestToRoom(new Guest("Aiko"), 3));
        
        System.out.println ();
        System.out.println ( hotel.addRoomCharge(3, new RoomCharge("SnackySnack", 9.99)));
        System.out.println (hotel.addRoomCharge(3, new RoomCharge("LoneStar Chicken", 9.99)));
        System.out.println (hotel.addRoomCharge(1, new RoomCharge("Cookies", 10.99)));
        System.out.println (hotel.addRoomCharge(6, new RoomCharge("Cookies", 10.99)));
        
       System.out.println ();
        System.out.println (hotel.checkOut(3));
        System.out.println (hotel.checkOut(2));
        System.out.println (hotel.checkOut(1));
        System.out.println (hotel.checkOut(5));
    }
    }




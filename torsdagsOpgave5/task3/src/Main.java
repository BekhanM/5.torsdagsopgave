import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 4, 2);
        Room room2 = new Room(6, 9, 7);
        Room room3 = new Room(3, 5, 8);

        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        Building building = new Building(roomList,36,18,true);

        int totallamps = countLampsInBuilding(building);
        System.out.println("Hey, bro. Antallet af lamper i bygningen er: " + totallamps + " , bro.");

        boolean isNormalBuilding = isNormal(building);
        if (isNormalBuilding) {
            System.out.println("Det sgu en helt normal bygning, bro.");
        } else {
            System.out.println("Fandme underlig bygning det her, bro.");
        }
    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        List<Room> rooms = building.getRooms();
        for(Room room : rooms) {
            totalLamps += room.getLamps();
        }
        return totalLamps;
    }

    public static boolean isNormal(Building building) {
        return building.getFloors() > building.getRooms().size();
    }
}
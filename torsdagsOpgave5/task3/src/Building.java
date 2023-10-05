import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Room> rooms;
    private int bathrooms;
    private int floors;
    private boolean isOfficeBuilding;

    public Building(List<Room> rooms, int bathrooms, int floors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.bathrooms = bathrooms;
        this.floors = floors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getFloors() {
        return floors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}

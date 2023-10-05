public class Room {
    private int doors;
    private int lamps;
    private int windows;

    public Room(int doors, int lamps, int windows) {
        this.doors = doors;
        this.lamps = lamps;
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getLamps() {
        return lamps;
    }

    public int getWindows() {
        return windows;
    }
}

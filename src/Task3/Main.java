package Task3;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Room> collectionOfRooms = new ArrayList<>();

    public static void main(String[] args) {


        Room livingRoom = new Room(4, 2);
        Room bathRoom = new Room(2, 1);
        Room kitchen = new Room(5, 3);

        collectionOfRooms.add(livingRoom);
        collectionOfRooms.add(bathRoom);
        collectionOfRooms.add(kitchen);

        Building house = new Building(collectionOfRooms, 2);

        countLampsInBuilding(house);
        countWindowsInBuilding(house);
        countRoomsInBuilding(house);
        isNormal(house);

    }

    public static void countLampsInBuilding(Building b) {

        int sum = 0;

        for (Room room : b.getRooms()) {

            sum = sum + room.getNumberOfLamps();

        }
        System.out.println("There is " + sum + " lamps in the building.");
    }

    public static void countWindowsInBuilding(Building b) {

        int sum = 0;

        for (Room room : b.getRooms()) {

            sum = sum + room.getNumberOfWindows();

        }
        System.out.println("There is " + sum + " windows in the building.");
    }

    public static void countRoomsInBuilding(Building b) {

        int sum = 0;

        for (Room room : b.getRooms()) {

            sum++;

        }
        System.out.println("There is " + sum + " rooms in the building.");
    }

    public static void isNormal(Building b) {
        boolean moreFloorsThanRooms = (b.getNumberOfFloors() == b.getRooms().size()) || (b.getNumberOfFloors() <= b.getRooms().size());
        if (moreFloorsThanRooms) {
            System.out.println("This building follows the rules of our universe. Good job.");
        } else {
            System.out.println("There's more floors than rooms...\nThis building, quite literally, cannot exist.");
        }

    }
}

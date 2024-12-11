import java.util.Random;
public class Dungeon {
    
    private int numberOfRooms;
    private String roomType;

    String[] arr={"battleRoom", "treasureRoom", "trapRoom"};
    Random r = new Random();
    int randomRoom = r.nextInt(arr.length);

    
    private createRoom()
    {
        roomType = arr[randomRoom];
        if roomType = "battleRoom"
        {
            System.out.println("This is a battle room.");
        }
    }

    public createDungeon(currentRooms)
    {
        numberOfRooms = currentRooms;
        while (currentRooms != 0)
        {
            createRoom();
            currentRooms -= 1;
        }
    }

    public String toString()
    {
        return "Dungeon with " + numberOfRooms + " rooms.";
    }
}

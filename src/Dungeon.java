import java.util.Random;
public class Dungeon extends Store{
    
    private int numberOfRooms;
    private String roomType;

    String[] arr={"battleRoom", "treasureRoom", "trapRoom"};
    Random r = new Random();
    int randomRoom = r.nextInt(arr.length);

    
    private void createRoom()
    {
        roomType = arr[randomRoom];
        if (roomType == arr[0])
        {
            System.out.println("a battle room.");
        }
        if (roomType == arr[1])
        {
            System.out.println("a treasure room.");
        }
        if (roomType == arr[2])
        {
            System.out.println("a mystery room.");
        }
    }

    public void createDungeon(int currentRooms)
    {
        numberOfRooms = currentRooms;
        while (currentRooms != 0)
        {
            createRoom();
            currentRooms -= 1;
        }
    }

    public void treasureRoom(){
        System.out.println("You have entered a treasure room. You quickly stuff your wallets...");
        money += 150;
        System.out.println("You gained 150 coins.");
        System.out.println("You have " + money + " coins.");
    }

    public String toString()
    {
        return "Creating a new dungeon with " + numberOfRooms + " rooms:";
    }
}

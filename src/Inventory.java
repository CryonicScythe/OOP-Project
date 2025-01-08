public class Inventory extends Dungeon {
    
    private int currentItems = 0;
    private int bagSize;
    
    public void treasure(){
        currentItems += 1;
    }

    public String toString()
    {
        return "Inventory capacity: " + bagSize + " Number of items in inventory: " + currentItems;
    }
}

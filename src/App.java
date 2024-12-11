public class App {
    public static void main(String[] args) throws Exception {
        // Greet user
        System.out.println("Welcome to this generic RPG, with even more generic gameplay!");

        // Instantitate objects
        Store shop = new Store();
        Dungeon field = new Dungeon();
        Fight battle = new Fight();
        Inventory bag = new Inventory();

        // Print your objects
        System.out.println(shop);
        System.out.println(field);
        System.out.println(battle);
        System.out.println(bag);
        
    }
}

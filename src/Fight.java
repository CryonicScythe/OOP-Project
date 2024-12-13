public class Fight {
    
    private int playerHealth;
    private int enemyHealth;
    private int playerLevel;
    private int weaponDamage;
    private int expGained;

    public String toString()
    {
        return "Player health: " + playerHealth + "/n Player Level: " + playerLevel + "/n Exp gained: " + expGained + "/n Enemy health: " + enemyHealth + "/n Weapon dmg: " + weaponDamage;
    }
}

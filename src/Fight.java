public class Fight {
    
    private int playerHealth;
    private int enemyHealth;
    private int playerLevel;
    private int weaponDamage;
    private int expGained;

    public String toString()
    {
        return "Player health: " + playerHealth + " Player Level: " + playerLevel + " Exp gained: " + expGained + " Enemy health: " + enemyHealth + " Weapon dmg: " + weaponDamage;
    }
}

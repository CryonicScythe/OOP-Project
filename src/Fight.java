import java.util.Scanner;

public class Fight extends Inventory {
    
    private int playerLevel;
    private int playerHealth;
    private int enemyHealth;
    private int weaponDamage;
    private int enemyDamage;
    private int expGained;
    private int totalExp = 0;
    public int gradeLevel;

    Scanner input = new Scanner(System.in);

    // Initiates stats at the start of the fight
    public void startFight()
    {
        playerHealth = playerLevel * 3 + 30;
        weaponDamage = gradeLevel * 5;
        enemyHealth = playerHealth / 3 * gradeLevel;
        enemyDamage = gradeLevel + 2;
    }

    // Grants exp and levels at end of battle
    private void levelUp()
    {
        totalExp = totalExp + expGained;
        if (totalExp >= 100){
            playerLevel += 1;
            totalExp -= 100;
        }
        
    }

    // Grants exp and a weapon after battle
    private void winFight()
    {
        expGained = enemyHealth + 30;
        levelUp();
    }

    // Exits dungeon and returns to main interface
    public void leaveDungeon()
    {

    }

    // 
    public void battle()
    {
        System.out.println("Enemy health: " + enemyHealth);
        while (enemyHealth > 0){
            System.out.println("[1] Fight");
            System.out.println("[2] Escape");
            int option = input.nextInt();
            if (option == 1){
                enemyHealth -= weaponDamage;
                System.out.println("Attacked the enemy! Enemy health: " + enemyHealth);
                playerHealth -= enemyDamage;
                System.out.println("The enemy attacks back! Player health: " + playerHealth);
            }
            if (option == 2){
                leaveDungeon();
            }
            if (playerHealth <= 0){
                leaveDungeon();
                money -= 100;
                totalExp -= 30;
            }
        }
        winFight();
    }


    public String toString()
    {
        return "Player health: " + playerHealth + " Player Level: " + playerLevel + " Exp gained: " + expGained + " Enemy health: " + enemyHealth + " Weapon dmg: " + weaponDamage;
    }
}

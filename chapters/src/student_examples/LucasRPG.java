package student_examples;

import java.util.Scanner;

public class LucasRPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int turn = 1;
        
        // Player attributes
        int playerHealth = 200;
        int playerMana = 100;

        // Player move damage
        int[] PlayerMovesDamage = new int[3];
        PlayerMovesDamage[0] = 15;
        PlayerMovesDamage[1] = 30;
        PlayerMovesDamage[2] = 60;

        // Player move mana costs
        int[] PlayerMovesCost = new int[5];
        PlayerMovesCost[0] = 10;
        PlayerMovesCost[1] = 30;
        PlayerMovesCost[2] = 50;
        PlayerMovesCost[3] = 0;
        PlayerMovesCost[4] = 40;

        // Enemy attributes 
        int EnemyHealth = 200;

        // Enemy move damage
        int[] EnemyMovesDamage = new int[3];
        EnemyMovesDamage[0] = 10;
        EnemyMovesDamage[1] = 25;
        EnemyMovesDamage[2] = 80;
        
        // Enemy move names
        String[] EnemyMoveNames = new String[3];
        EnemyMoveNames[0] = "Punch";
        EnemyMoveNames[1] = "Roundhouse Kick";
        EnemyMoveNames[2] = "Super Slam";
        System.out.println("██      ██    ██  ██████  █████  ███████     ██████  ██████   ██████      ");
        System.out.println("██      ██    ██ ██      ██   ██ ██          ██   ██ ██   ██ ██           ");
        System.out.println("██      ██    ██ ██      ███████ ███████     ██████  ██████  ██   ███     ");
        System.out.println("██      ██    ██ ██      ██   ██      ██     ██   ██ ██      ██    ██     ");
        System.out.println("███████  ██████   ██████ ██   ██ ███████     ██   ██ ██       ██████      ");
        System.out.println("");

        System.out.println("Oh no! An enemy in attacking! What will you do? (choose a number)");
        
        // if one of the fighters health goes to zero, the battle will end
        while(playerHealth > 0 && EnemyHealth > 0) {

            // Creates a cap on Health and Mana 
            if (playerHealth > 200) {
                playerHealth = 200;
            }
            if (playerMana > 100) {
                playerMana = 100;
            }

            System.out.println("Turn: " + turn);
            System.out.println("   Ability                             Damage       Mana Cost ");
            System.out.println("==============================================================");
            System.out.println("1. Sword Slash                           15             10    ");
            System.out.println("2. Fireball                              30             30    ");
            System.out.println("3. Lightning Strike                      60             50    ");
            System.out.println("4. Mana Recharge                          0            -60    ");
            System.out.println("5. Heal                            Heals 70             40    ");
            System.out.println("==============================================================1");
            System.out.println("Health: " + playerHealth + "     Mana: " + playerMana);
            System.out.println("Enemy Health: " + EnemyHealth);
            
            // Players turn
            int MoveChoice = input.nextInt();
            switch (MoveChoice) {
                case 1: 
                    if (playerMana < PlayerMovesCost[0]) {
                        System.out.println("You dont have enough mana");   
                    }
                    else System.out.println("You use Sword Slash!");
                    
                    playerMana = playerMana - PlayerMovesCost[0];
                    EnemyHealth = EnemyHealth - PlayerMovesDamage[0];
                    
                    break;
            case 2:
                if (playerMana < PlayerMovesCost[1]) {
            System.out.println("You dont have enough mana");   
            break;  
            }  
            else 
            System.out.println("You use Fireball!");
                playerMana = playerMana - PlayerMovesCost[1];
                EnemyHealth = EnemyHealth - PlayerMovesDamage[1];
                break;
            case 3:
                if (playerMana < PlayerMovesCost[2]) {
            System.out.println("You dont have enough mana");   
            break;  
            }  
            else 
            System.out.println("You use Lightning Strike!");
                playerMana = playerMana - PlayerMovesCost[2];
                EnemyHealth = EnemyHealth - PlayerMovesDamage[2];
                break;
            case 4:
                System.out.println("You use Mana Recharge!");
                playerMana = playerMana + 60;
                break;
            case 5: 
            if (playerMana < PlayerMovesCost[4]) {
            System.out.println("You dont have enough mana");   
            break; 
            }
            else
                System.out.println("You use Heal! You heal yourself for 70 health");
                playerMana = playerMana - PlayerMovesCost[4];
                playerHealth = playerHealth + 70;
            break;
            }    
            
            // Enemies turn

            if (turn % 5 == 0) {
                System.out.println("Enemy used " + EnemyMoveNames[2] + ", it did " + EnemyMovesDamage[2] + " damage");
                playerHealth = playerHealth - EnemyMovesDamage[2]; 
            }
            
            
            else if (turn % 2 == 1) {
                System.out.println("Enemy used " + EnemyMoveNames[0] + ", it did " + EnemyMovesDamage[0] + " damage");
                playerHealth = playerHealth - EnemyMovesDamage[0]; 
            }

            else if (turn % 2 == 0) {
                System.out.println("Enemy used " + EnemyMoveNames[1] + ", it did " + EnemyMovesDamage[1] + " damage");
                playerHealth = playerHealth - EnemyMovesDamage[1]; 
            }

            // Turn increments when both player and enemy attack
            turn = turn + 1;

        }

        if (EnemyHealth <= 0 && playerHealth <= 0) {
            System.out.println("Draw! You and the enemy are equal in skill");
            System.out.println("Try again to defeat your enemy once and for all");
            
        }
        
        else if (playerHealth > EnemyHealth) {
            System.out.println("Victory! The enemy has been defeated!");
            System.out.println("Gained " + (turn * playerMana)  + " Gold and " + (turn * playerHealth) + " XP");
            
        }

        else if (EnemyHealth > playerHealth) {
            System.out.println("Defeat! You have been defeated my the enemy...");
            System.out.println("Try again to reclaim your honour!");
            
        }
        
}
}
package Game;

import Characters.Archers.Ranger;
import Characters.Healers.Medic;
import Characters.Knights.Squire;
import Characters.Mages.Warlock;
import Characters.MythicalCreatures.Dragon;
import Player.Player;

public class Game {

    public static void main(String[] args) {
        System.out.println("Game.main() called");
        
        try {
            // Create Players
            System.out.println("Creating players...");
            
            // Created by me
            Player me = new Player("myName", "myUserName");
            me.setHomeGround("Marshland");  // Set home ground for player 1
            me.setGoldCoins(250);
            me.setXP(50);
            System.out.println("Created player: " + me.getName() + " (Home Ground: " + me.getHomeGround() + ")");

            // Created by others
            Player player1 = new Player("GeraltofRivia", "whitewolf");
            player1.setHomeGround("Marshland");
            player1.setGoldCoins(250);
            player1.setXP(32);
            System.out.println("Created player1: " + player1.getName() + " (Home Ground: " + player1.getHomeGround() + ")");
            
            // Add characters to player1's army with proper stats
            System.out.println("Adding characters to player1's army...");
            player1.addToArmy("Archer", new Ranger("Ranger1", 10, 8, 7, 6, 5, "Highlanders"));
            player1.addToArmy("Knight", new Squire("Squire1", 12, 9, 7, 5, 6, "Marshlanders"));
            player1.addToArmy("Mage", new Warlock("Warlock1", 8, 5, 10, 7, 8, "Sunchildren"));
            player1.addToArmy("Healer", new Medic("Medic1", 7, 6, 8, 9, 7, "Highlanders"));
            player1.addToArmy("MythicalCreature", new Dragon("Dragon1", 15, 10, 12, 8, 6, "Marshlanders"));

            Player player2 = new Player("alex", "alex21");
            player2.setHomeGround("Marshland");
            player2.setGoldCoins(200);
            player2.setXP(25);
            System.out.println("Created player2: " + player2.getName() + " (Home Ground: " + player2.getHomeGround() + ")");
            
            // Add characters to player2's army with proper stats
            System.out.println("Adding characters to player2's army...");
            player2.addToArmy("Archer", new Ranger("Ranger2", 10, 8, 7, 6, 5, "Highlanders"));
            player2.addToArmy("Knight", new Squire("Squire2", 12, 9, 7, 5, 6, "Marshlanders"));
            
            // Print player info
            System.out.println("\n=== Player Information ===");
            System.out.println("Player 1: " + player1.getName() + 
                             " (Home Ground: " + player1.getHomeGround() + 
                             ", Army Size: " + player1.getArmy().size() + ")");
            System.out.println("Player 2: " + player2.getName() + 
                             " (Home Ground: " + player2.getHomeGround() + 
                             ", Army Size: " + player2.getArmy().size() + ")\n");
            
            // Simulate opponent search and challenge
            System.out.println("Searching for opponents...");
            me.searchForOpponents();
            System.out.println("Accepting challenge...");
            me.acceptChallenge();
            me.skipToNextPlayer();
            
            // Start combat
            System.out.println("\n=== Starting Combat ===");
            Combat combat = new Combat(player1, player2);
            combat.startCombat();
            
            // Check combat result
            System.out.println("\n=== Combat Finished ===");
            int result = combat.getResult();
            if (result == 1) {
                System.out.println(player1.getName() + " won!");
            } else if (result == 2) {
                System.out.println(player2.getName() + " won!");
            } else {
                System.out.println("The battle ended in a draw!");
            }
            
            System.out.println("\n=== Game Over ===");
            
        } catch (Exception e) {
            System.err.println("An error occurred in Game.main():");
            e.printStackTrace();
            System.out.println("\nThe game encountered an error and had to end.");
        }
        

        

    }
}

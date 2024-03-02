import java.util.Scanner;
import Game.*;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n=== Mystic Mayhem ===");
        System.out.println("A Fantasy Battle Game\n");
        
        boolean running = true;
        
        while (running) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Start New Game");
            System.out.println("2. Load Game");
            System.out.println("3. How to Play");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                
                switch (choice) {
                    case 1:
                        startNewGame();
                        break;
                    case 2:
                        loadGame();
                        break;
                    case 3:
                        showInstructions();
                        break;
                    case 4:
                        System.out.println("\nThanks for playing Mystic Mayhem!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                e.printStackTrace();
            }
        }
        
        scanner.close();
    }
    
    private static void startNewGame() {
        System.out.println("\n=== New Game ===");
        System.out.println("Starting a new game...");
        
        try {
            // Run the Game class directly
            System.out.println("Launching game...");
            
            // Print classpath for debugging
            String classpath = System.getProperty("java.class.path");
            System.out.println("Classpath: " + classpath);
            
            // Try running the Game class directly
            System.out.println("\n=== GAME OUTPUT START ===");
            Game game = new Game();
            Game.main(new String[]{});
            System.out.println("=== GAME OUTPUT END ===\n");
            
            System.out.println("Game finished.");
        } catch (Exception e) {
            System.err.println("An error occurred while starting the game:");
            e.printStackTrace();
            
            // Print additional debug info
            System.err.println("\n=== DEBUG INFO ===");
            System.err.println("Current directory: " + System.getProperty("user.dir"));
            System.err.println("Java version: " + System.getProperty("java.version"));
            System.err.println("Java home: " + System.getProperty("java.home"));
            
            System.out.println("\nPress Enter to return to the main menu...");
            scanner.nextLine();
        }
    }
    
    private static void loadGame() {
        System.out.println("\n=== Load Game ===");
        System.out.println("This feature is not yet implemented.");
        // TODO: Implement game loading functionality
    }
    
    private static void showInstructions() {
        System.out.println("\n=== How to Play ===");
        System.out.println("1. Build your army by selecting different character types");
        System.out.println("2. Choose your home ground for strategic advantages");
        System.out.println("3. Battle against AI opponents");
        System.out.println("4. Earn gold and experience to improve your army");
        System.out.println("5. The last commander standing wins!");
    }
}

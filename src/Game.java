/**
 * Created by k1763682 on 30/10/17.
 */
import java.util.Scanner;
public class Game {
    boolean userQuit = false;
    Creature creature;
    Scanner scanner = new Scanner(System.in);

    public void run() {
        startTutorial();

        while (!userQuit) {
            interact();
            System.out.println(this.creature.checkStatus());
        }
        System.out.println("Aw, time to quit");
    }


    private void startTutorial() {
        System.out.println("Hi there! Welcome to javagotchi\n");
        System.out.println("Whats the name of your creature?\n");
        String name = scanner.nextLine();
        this.creature = new Creature(name);
        System.out.println("Great! you can now meet " + this.creature.getName());
    }


    private void interact() {
        System.out.println("What would you like to do?\n");
        System.out.println("1. Play");
        System.out.println("2. Eat");
        System.out.println("3. Sleep");
        System.out.println("4. Quit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                creature.play();
                break;
            case 2:
                creature.eat();
                break;
            case 3:
                creature.sleep();
                break;
            case 4:
                userQuit = true;
                break;
            default:
                System.out.println("Please enter a number between 1 and 4");
                break;
        }
    }
}

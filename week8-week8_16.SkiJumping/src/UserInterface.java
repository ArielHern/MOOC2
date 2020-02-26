import java.util.Scanner;

public class UserInterface {
    private Scanner scannner;
    private Tournament jumpers;
    private int counter;

    public UserInterface() {
        scannner = new Scanner(System.in);
        jumpers = new Tournament();
        this.counter = 1;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("\n" +
                "Write the names of the participants one at a time; an" +
                "empty string brings you to the jumping phase.");
        while (true) {
            System.out.print(" Participant name: ");
            String command = scannner.nextLine();
            if (command.isEmpty()) {
                System.out.println("\nThe tournament begins!");
                jumpMenu();
                break;
            }
            this.jumpers.add(command);
        }
    }

    public void jumpMenu() {

        while (true) {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");

            String command = scannner.nextLine();
            if (command.equals("quit")) {
                System.out.println("Thanks");
                System.out.println("");
                System.out.println("\nTournament results:");
                this.jumpers.finalPrint();
                break;
            }

            System.out.println("\nRound " + counter);
            System.out.println("\nJumping order: ");
            this.jumpers.print();

            System.out.println("\nResults of round " + counter);
            this.jumpers.printAfterJump();
            this.counter++;

        }

    }

}












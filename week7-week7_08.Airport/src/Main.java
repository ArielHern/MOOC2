
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
//        String input ="1\n" +
//                "HA-LOL\n" +
//                "42\n" +
//                "1\n" +
//                "G-OWAC\n" +
//                "101\n" +
//                "2\n" +
//                "HA-LOL\n" +
//                "HEL\n" +
//                " BAL\n" +
//                "2\n" +
//                "G-OWAC\n" +
//                "JFK\n" +
//                "BAL\n" +
//                "x\n" +
//                "2\n" +
//                "3\n" +
//                "HA-LOL\n" +
//                "x";


        Scanner reader = new Scanner(System.in);
        UserInterface ui = new UserInterface(reader);
        ui.start();
    }
}


public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
//        printWithSmileys("Mikael");
//        printWithSmileys("Beerbottle");
//         printWithSmileys("Interface");
//        printWithSmileys("\\:D/");
        printWithSmileys("87.");
    }

    private static void printWithSmileys(String characterString) {
        printTopBottom(characterString);
        System.out.println();
        printMiddle(characterString);
        printTopBottom(characterString);

    }

    public static void printMiddle(String characterString) {
        if (characterString.length() % 2 == 0) {
            System.out.println(":) " + characterString + " :)");
        } else {
            System.out.println(":) " + characterString + "  :)");
        }
    }

    public static void printTopBottom(String characterString) {
        if (characterString.length() < 6) {
            for (int smiles = 0; smiles < characterString.length() + 1; smiles++) {
                System.out.print(":)");
            }

        } else if (characterString.length() == 6) {
            for (int smiles = 0; smiles < characterString.length(); smiles++) {
                System.out.print(":)");
            }
        } else {
            if (characterString.length() > 6 && characterString.length() % 2 == 0) {
                for (int smiles = 0; smiles < characterString.length() - 2; smiles++) {
                    System.out.print(":)");
                }
            } else {
                for (int smiles = 0; smiles < characterString.length() - 1; smiles++) {
                    System.out.print(":)");
                }
            }
        }

    }
}



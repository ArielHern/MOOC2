import java.io.File;
import java.util.Scanner;

public class Printer {
    private Scanner reader;
    private File f;

    public Printer(String fileName) throws Exception {
        f = new File(fileName);

    }

    public void printLinesWhichContain(String word) throws Exception {
        reader = new Scanner(f, "UTF-8");
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }


    }

}


package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringJoiner;

public class Analysis {
    private final File file;
    private Scanner reader;

    public Analysis(File filename) throws FileNotFoundException {
        file = filename;
    }

    public int lines() throws FileNotFoundException {
        reader = new Scanner(file);

        int lineCounter = 0;
        while (reader.hasNextLine()) {
            if (!reader.nextLine().isEmpty()) ;
            lineCounter++;

        }
        reader.close();
        return lineCounter;
    }

    public int characters() throws FileNotFoundException {
        reader = new Scanner(file);
        int charCounter = 0;
        while (reader.hasNext()) {
                String r = reader.nextLine();
                charCounter+= r.length()+1;

        }
        reader.close();
        return charCounter;
    }
}

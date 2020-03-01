package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private List<String> words;

    public WordInspection(File file) {
        try {
            this.words = getWords(file);
        } catch (Exception e) {
            this.words = new ArrayList<String>();
        }

    }

    public List<String> getWords(File file) throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> readLines = new ArrayList<String>();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            line.trim();

            if (!line.isEmpty()) {
                readLines.add(line);
            }
        }
        return readLines;
    }

    public int wordCount() {
        return words.size();

    }


    public List<String> wordsContainingZ() throws FileNotFoundException {
        List<String> wordsContainingZ = new ArrayList<String>();

        for (String word : this.words) {
            if (word.contains("z")) {
                wordsContainingZ.add(word);
            }
        }


        return wordsContainingZ;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        List<String> wordsEndingInL = new ArrayList<String>();

        for (String word : this.words) {
            if (word.endsWith("l")) {
                wordsEndingInL.add(word);
            }
        }

        return wordsEndingInL;
    }

    public List<String> palindromes() throws FileNotFoundException {
        List<String> palindromes = new ArrayList<String>();

        for (String word : this.words) {
            if (isPalindrome(word)) {
                palindromes.add(word);
            }
        }

        return palindromes;
    }

    public boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        List<String> wordsWhichContainAllVowels = new ArrayList<String>();


        for (String word : this.words) {
            if (word.contains("a") && word.contains("e") &&
                    word.contains("i") && word.contains("o") && word.contains("u") &&
                    word.contains("y") && word.contains("ä") && word.contains("ö")) {
                wordsWhichContainAllVowels.add(word);
            }

        }

        return wordsWhichContainAllVowels;
    }

}

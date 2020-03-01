package dictionary;

public class Main {
    public static void main(String[] args) {
        MultipleEntryDictionary test  = new PersonalMultipleEntryDictionary();

        test.add("apina","monkey");

        System.out.println(test.translate("apina"));
    }
}

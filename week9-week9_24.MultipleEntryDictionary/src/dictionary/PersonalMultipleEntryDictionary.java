package dictionary;

import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary(){
        dictionary = new HashMap<String, Set<String>>();
    }

    public void add(String word, String entry) {
        if (!dictionary.containsKey(word)){
            dictionary.put(word, new HashSet<String>());
        }
        Set<String> translation  =  dictionary.get(word);
        translation.add(entry);

    }


    public Set<String> translate(String word) {

            if (dictionary.containsKey(word)){
                return dictionary.get(word);
            }


        return null;
    }


    public void remove(String word) {
       if (dictionary.containsKey(word)){
           dictionary.remove(word);
       }

    }
}

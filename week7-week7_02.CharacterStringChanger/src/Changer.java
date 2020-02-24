import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes;

    public Changer() {
        this.changes = new ArrayList<>();
    }

    public void addChange(Change change) {
        this.changes.add(change);
    }

    public String change(String characterString) {
        String word = "";
        for (Change changes : this.changes) {
            word += changes.change(characterString);
        }
        return word;
    }

}

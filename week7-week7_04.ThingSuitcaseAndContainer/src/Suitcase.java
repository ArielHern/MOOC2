import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int weightLimit;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList();
    }

    public Thing heaviestThing() {
        if (this.things.size() == 0) {
            return null;
        } else {
            Thing heaviest = new Thing("Test", 0);
            for (Thing item : this.things) {
                if (item.getWeight() > heaviest.getWeight()) {
                    heaviest = item;

                }
            }
            return heaviest;
        }
    }

    public void addThing(Thing thing) {
        if (this.weightLimit >= this.totalWeight() + thing.getWeight()) {
            this.things.add(thing);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing item : this.things) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        for (Thing item : this.things) {
            System.out.println(item);
        }
    }

    public String toString() {
        if (this.things.size() == 0) {
            return "empty (" + this.totalWeight() + " kg)";
        } else if (this.things.size() == 1) {
            return this.things.size() + " thing (" + this.totalWeight() + " kg)";

        } else {
            return this.things.size() + " things (" + this.totalWeight() + " kg)";
        }

    }
}

import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcase;
    private int weightLimit;
    private int weight;

    public Container(int weightLimit) {
        this.suitcase = new ArrayList<Suitcase>();
        this.weightLimit = weightLimit;
        this.weight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (weightLimit < this.weight + suitcase.totalWeight())
            return;
        weight += suitcase.totalWeight();
        this.suitcase.add(suitcase);
    }

    public void printThings() {
        for (Suitcase suitcase : this.suitcase) {
            suitcase.printThings();
        }
    }

    public String toString() {
        return this.suitcase.size() + " suitcases (" + this.weight + " kg)";
    }
}

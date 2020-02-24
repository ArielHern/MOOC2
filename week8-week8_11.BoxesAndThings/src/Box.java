import java.util.ArrayList;

public class Box implements ToBeStored {
    private ArrayList<ToBeStored> box;
    private double maxWeight;

    public Box(double maxWight) {
        this.box = new ArrayList<ToBeStored>();
        this.maxWeight = maxWight;
    }

    public void add(ToBeStored store) {
        if (this.weight() + store.weight() <= this.maxWeight) {
            box.add(store);
        }

    }

    public double weight() {
        double totalWeight = 0;
        for (ToBeStored stuff : this.box) {
            totalWeight += stuff.weight();
        }
        return totalWeight;
    }

    public String toString() {
        return "Box: " + this.box.size() + " things, " + "total weight " + this.weight() + " kg";
    }
}

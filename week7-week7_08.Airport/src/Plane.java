import java.util.HashMap;

public class Plane {
    private HashMap<String, Integer> planes;

    public Plane() {
        this.planes = new HashMap<String, Integer>();
    }

    public void add(String id, int capacity) {
        this.planes.put(id, capacity);
    }

    public void printPlanes() {
        for (String plane : this.planes.keySet()) {
            System.out.println(plane + " (" + planes.get(plane) + " ppl)");
        }
        System.out.println("");

    }

    public void planeInfo(String planeId) {
        if (this.planes.containsKey(planeId)) {
            System.out.println(planeId + " (" + planes.get(planeId) + " ppl)");
        }
        System.out.println("");
    }

    // Help with the priting on flights
    public String getPlanePas(String planeId) {
        if (this.planes.containsKey(planeId)) {
            return (" (" + planes.get(planeId) + " ppl)");
        }
        return "";
    }

    public boolean checkPlaneId(String planeId) {
        if (this.planes.containsKey(planeId)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.planes.toString();
    }
}

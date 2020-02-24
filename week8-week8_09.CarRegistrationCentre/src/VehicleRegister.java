import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.get(plate) == null) {
            this.owners.put(plate, owner);
            return true;
        }
        return false;

    }

    public String get(RegistrationPlate plate) {
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.get(plate) == null) {
            return false;
        }
        this.owners.remove(plate);
        return true;

    }

    public void printRegistrationPlates() {
//        this.owners.keySet().stream().forEach(System.out::println);
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> names = new ArrayList<String>();
        for (RegistrationPlate plate : this.owners.keySet()) {
            if (!names.contains(owners.get(plate))){
                names.add(owners.get(plate));
            }

        }
        for (String name:names){
            System.out.println(name);
        }
    }
}



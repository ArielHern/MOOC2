
import java.util.ArrayList;
import java.util.List;

public class Contact implements Comparable<Contact> {
    private String name;
    private String address ="";
    private List<String> phoneNumbers;

    public Contact(String name) {
        this.name = name;
        this.phoneNumbers = new ArrayList<String>();

    }

    public void addNumberToContact(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }


    public List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public String getAddress() {
        return this.address;

    }

    @Override
    public String toString() {
        StringBuilder information = new StringBuilder();

        information.append(address.length() > 0 ? "  address: " +address : "  address unknown");
        information.append("\n");

        if (phoneNumbers.size() > 0){
            information.append("  phone numbers:\n");
            for (String number :phoneNumbers){
                information.append("   "+number);

                information.append("\n");
            }
            information.deleteCharAt(information.length() - 1);
        }else{
            information.append("  phone number not found");


        }
        return information.toString();

    }

    @Override
    public int compareTo(Contact p) {
        return this.getName().compareToIgnoreCase(p.getName());
    }
}

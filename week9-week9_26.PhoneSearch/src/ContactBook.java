
import java.util.*;


public class ContactBook {
    private Map<String, Contact> contactBook;

    public ContactBook() {
        this.contactBook = new HashMap<String, Contact>();

    }

    public void addContactNumber(String name, String number) {
        if (isNotContact(name)) {
            contactBook.put(name, new Contact(name));
        }
        contactBook.get(name).addNumberToContact(number);
    }

    public void addContactAddress(String name, String address) {
        if (isNotContact(name)) {
            contactBook.put(name, new Contact(name));
        }
        contactBook.get(name).setAddress(address);
    }

    public List<String> getNumberFromName(String name) {
        Contact contact = contactBook.get(name);
        if (contact == null) {
            return null;
        }
        return contact.getPhoneNumbers();
    }

    public String getNameFromNumber(String number) {
        for (String contact : contactBook.keySet()) {
            if (contactBook.get(contact).getPhoneNumbers().contains(number)) {
                return " " + contact;
            }
        }
        return " not found";
    }

    public Contact getContactInfo(String name) {
        return contactBook.get(name);
    }

    public void deleteContact(String name) {
        contactBook.remove(name);
    }

    public Set<Contact> getFilteredList(String filter) {
        Set<Contact> matches = new TreeSet<Contact>();

        for (String key : contactBook.keySet()) {
            Contact contact = contactBook.get(key);
            if (contact.getName().contains(filter) || contact.getAddress().contains(filter) || filter.equals("")) {
                matches.add(contact);
            }
        }

        return matches;
    }


    public boolean isNotContact(String name) {
        if (!contactBook.keySet().contains(name)) {
            return true;
        }
        return false;
    }


}
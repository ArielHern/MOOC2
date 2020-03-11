import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UiBookKeeping {
    private Scanner scanner;
    private ContactBook contacts;

    public UiBookKeeping() {
        this.scanner = new Scanner(System.in);
        this.contacts = new ContactBook();

    }

    public void startUi() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit");
        while (true) {

            System.out.print("\ncommand: ");
            String command = scanner.nextLine();
            if (command.equals("x")) {
                break;
            }
            if (command.equals("1")) {
                addContactNumber();
            } else if (command.equals("2")) {
                getContactNumberByName();
            } else if (command.equals("3")) {
                getContactNameByNumber();
            } else if (command.equals("4")) {
                addContactAddress();
            } else if (command.equals("5")) {
                getContactInfo();
            } else if (command.equals("6")) {
                removeContact();
            } else if (command.equals("7")) {
                filterList();
            }
        }
    }

    public void addContactNumber() {
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        System.out.print("number: ");
        String number = scanner.nextLine();

        contacts.addContactNumber(name, number);

    }

    public void getContactNumberByName() {
        System.out.print("whose number: ");
        String name = scanner.nextLine();

        if (contacts.isNotContact(name)) {
            System.out.println(" not found");
            return;
        }

        getContactNumbers(name);
    }

    public void getContactNumbers(String name) {
        List<String> numbers = new ArrayList<String>();
        numbers = contacts.getNumberFromName(name);
        if (!numbers.isEmpty()) {
            for (String phoneNum : numbers) {
                System.out.println(" " + phoneNum);
            }
        }
    }

    private void getContactNameByNumber() {
        System.out.print("number: ");
        String number = scanner.nextLine();

        System.out.println(contacts.getNameFromNumber(number));

    }

    public void addContactAddress() {
        System.out.print("whose address: ");
        String name = scanner.nextLine();

        System.out.print("street: ");
        String address = scanner.nextLine();
        System.out.print("city: ");
        address += " " + scanner.nextLine();

        contacts.addContactAddress(name, address);
    }

    public void getContactInfo() {
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        Contact contact = contacts.getContactInfo(name);
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println(" not found");
        }

    }

    public void filterList() {
        System.out.print("keyword (if empty, all listed): ");
        String filter = scanner.nextLine();
        Set<Contact> matches = contacts.getFilteredList(filter);

        if (!matches.isEmpty()) {
            int i = 1;
            for (Contact contact: matches) {
                System.out.println(" " + contact.getName());
                System.out.println(contact);

                if (i < matches.size()) {
                    System.out.println();
                }
                i++;
            }
        } else {
            System.out.println(" keyword not found");
        }
    }

    public void removeContact() {
        System.out.print("whose information: ");
        String name = scanner.nextLine();

        contacts.deleteContact(name);
    }

}



import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Plane planes;
    private Flight flights;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.planes = new Plane();
        this.flights = new Flight();
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        lineBreak();

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] add airplane\n[2] Add flight\n[x] Exit");
            String command = this.reader.nextLine();
            if (command.equals("x")) {
                this.flightService();
                break;
            } else if (command.equals("1")) {
                this.planeService();
            } else if (command.equals("2")) {
                addFlight();
            }
        }
    }


    private void planeService() {
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(this.reader.nextLine());

        this.planes.add(id, capacity);
        lineBreak();

    }


    private void addFlight() {
        System.out.print("Give plane ID: ");
        String planeId = this.reader.nextLine();
        if (this.planes.checkPlaneId(planeId)) {
            System.out.print("Give departure airport code: ");
            String depart = this.reader.nextLine();
            System.out.print("Give destination airport code: ");
            String destination = this.reader.nextLine();

            this.flights.add(planeId, depart, destination);
            lineBreak();
        }

    }

    public void flightService() {
        System.out.println("Flight service\n" +
                            "------------");
        while (true) {
            System.out.println("Choose operation:\n[1] Print planes\n[2] Print flights\n[3] Print plane info\n[x] Quit");
            String command = this.reader.nextLine();
            if (command.equals("x")) {
                lineBreak();
                break;
            } else if (command.equals("1")) {
                this.planes.printPlanes();
            } else if (command.equals("2")) {
                this.flights.printFlights(this.planes);
            } else if (command.equals("3")) {
                getPlaneInfo();
            }
        }
    }

    public void getPlaneInfo() {
        System.out.print("Give plane ID: ");
        String command = this.reader.nextLine();
        this.planes.planeInfo(command);
    }
    public void lineBreak(){
        System.out.println("");
    }


}

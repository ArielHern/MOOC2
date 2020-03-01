package application;

public class Main {
    public static void main(String[] args) {
        AverageSensor sensor = new AverageSensor();

        sensor.addSensor(new Thermometer());

        System.out.println(sensor.isOn());
    }
}

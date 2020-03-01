package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Integer> readings = new ArrayList<Integer>();
    private List<Sensor> sensors = new ArrayList<Sensor>();

    public AverageSensor() {
        this.readings = new ArrayList<Integer>();
        this.sensors = new ArrayList<Sensor>();
    }

    public void addSensor(Sensor additonal) {
        this.sensors.add(additonal);
    }

    public boolean isOn() {
        boolean power = true;
        for (Sensor sensor:this.sensors){
            if (!sensor.isOn()){
                power = false;
            }
        }
        return power;
    }

    public void on() {
        for (Sensor sensor : this.sensors) {
            sensor.on();
        }

    }

    public void off() {
        for (Sensor sensor : this.sensors) {
            sensor.off();
        }

    }

    public List<Integer> readings() {

        return this.readings;

    }


    public int measure() {
        if (this.sensors.size() == 0) {
            throw new IllegalStateException("No sensors found.");
        }
        int numberOfSensor = 0;
        int totalMeasures = 0;
        int read;

        for (Sensor sensor : this.sensors) {
            read =  sensor.measure();
            totalMeasures += read;
            numberOfSensor++;
        }
        int average =  totalMeasures / numberOfSensor;
        this.readings.add(average);
        return average;
    }
}

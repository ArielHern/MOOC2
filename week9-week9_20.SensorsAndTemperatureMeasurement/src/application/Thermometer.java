package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private Random random = new Random();
    private boolean power = false;


    public boolean isOn() {
        return this.power;
    }


    public void on() {
        this.power = true;

    }


    public void off() {
        this.power = false;

    }


    public int measure() {
        if (isOn()){
            return random.nextInt(60)-30;
        }
        throw new IllegalStateException("Thermometer is not on.");


    }
}

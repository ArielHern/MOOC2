package application;

public class ConstantSensor implements Sensor{
    private int measure;
//    private boolean power;

    public ConstantSensor(int measure) {
        this.measure = measure;
//        this.power = true;
    }

    public boolean isOn() {
        return true;
    }


    public void on() {
//        this.power = true;

    }

    public void off() {
//        this.power = false;
    }


    public int measure() {
        return this.measure;
    }
}

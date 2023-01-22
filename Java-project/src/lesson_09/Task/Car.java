package lesson_09.Task;

public class Car extends Vehicle {

    private boolean isElectrical;
    private String color;

    public Car(String manufacturer, int year, boolean isElectrical, String color) {
        super(manufacturer, year);
        this.isElectrical = isElectrical;
        this.color = color;
    }

    public boolean isElectrical() {
        return isElectrical;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void sayHello(){

    }
}

package lesson_09.Task;

public class Truck extends Vehicle {

    private String type;
    private String color;

    public Truck(String manufacturer, int year, String type, String color) {
        super(manufacturer, year);
        this.type = type;
        this.color = color;
    }

    @Override
    public void sayHello(){

    }
}

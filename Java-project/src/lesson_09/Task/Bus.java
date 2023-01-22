package lesson_09.Task;

public class Bus extends Vehicle {

    private long capacity;
    private String color;

    public Bus(String manufacturer, int year, long capacity, String color) {
        super(manufacturer, year);
        this.capacity = capacity;
        this.color = color;
    }



    @Override
    public void sayHello(){

    }
}

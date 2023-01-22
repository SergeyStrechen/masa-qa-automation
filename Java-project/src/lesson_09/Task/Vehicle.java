package lesson_09.Task;

public abstract class Vehicle {

    private String manufacturer;
    private int year;

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void SayHello(){
        System.out.println("Hello");
    };

    public abstract void whoAreYou();

   
}

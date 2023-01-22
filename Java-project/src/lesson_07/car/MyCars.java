package lesson_07.car;

public class MyCars {
    public static void main(String[] args) {

        Car mercedes = new Car();
        mercedes.carIsReady();
        System.out.println("mercedes.color = " + mercedes.color);
        mercedes.color = "black";
        System.out.println("mercedes.color = " + mercedes.color);
        System.out.println("mercedes.isElectrical = " + mercedes.isElectrical);
        System.out.println("mercedes.year = " + mercedes.year);

        // Create a first car
        // Create a second car
        Car tesla = new Car();
        tesla.color = "white";
        tesla.year = 2022;

        System.out.println("tesla.manufacturer = " + tesla.manufacturer);
    }
}

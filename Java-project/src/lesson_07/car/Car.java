package lesson_07.car;

public class Car {

    String color;
    int year;
    String manufacturer;
    String model;
    boolean isElectrical;

    public Car(String color) {
            this.color = color;
        }

        public Car(){

        }

        public Car(String manufacturer, int year){

            this.manufacturer = manufacturer;
            this.year = year;
        }
        public void carIsReady() {
        System.out.println("I'm ready");
        }
}

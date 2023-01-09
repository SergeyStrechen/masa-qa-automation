package lesson_6.methods;

public class Method_02_VoidWithParams {
    public static void main(String[] args) {

        sayHello("ALex");
        String studentnName = "Donald Trump";
        sayHello(studentnName, 70);
    }

    public static void sayHello(String name, int age){
        System.out.println("Hello " + name + "!");
        System.out.println("You're " + age + " years old");
    }
}

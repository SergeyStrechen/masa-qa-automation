package lesson_07.Student;

import java.util.Scanner;

public class Student {

        private String name;
        private int age;

        private Scanner input = new Scanner(System.in);
        public Student(String name, int age) {
            while (age < 18 || age > 100){
                System.out.println("Your age " + age + " is not valid. Try Again... ");

                age = input.nextInt();

            }
            this.name = name;
            this.age = age;
        }
    }
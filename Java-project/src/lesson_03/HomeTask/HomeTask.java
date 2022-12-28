package lesson_03.HomeTask;

public class HomeTask {
    public static void main(String[] args) {

//--------------Task 1--------------------------------------------------------------------------------------------

        int i1 = 5, i2 = 11;
        double d1 = 5.5, d2 = 1.3;
        long l = 20l;
        double result = 0;

        System.out.println("Task 1:\n result = " + (i2 / i1 + d2 % i1 - l));

        int a = 5, b = 8;

        System.out.println("Task 1.2:\n a = " + (a-- - --a + ++a + a++ + a) +
                                     ", b = " + (++b - b++ + ++b - --b));

//--------------Task 2--------------------------------------------------------------------------------------------

        int x = 10, y = 12, z = 3;

        System.out.println("Task 2:\n " + (x += y - x++ * z));
        System.out.println(" " + (z = --x - y * 5));
        System.out.println(" " + (y /= x + 5 % z));
        System.out.println(" " + (z = x++ + y * 5));
        System.out.println(" " + (x = y - x++ * z));


    }
}

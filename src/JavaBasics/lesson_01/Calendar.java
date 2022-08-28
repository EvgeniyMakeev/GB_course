package JavaBasics.lesson_01;

import java.util.Scanner;
import java.util.zip.InflaterOutputStream;

public class Calendar {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Хотите узнать високосный ли год? Введите год: ");
        int year = userInput.nextInt();

        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
            System.out.println("Год " + year + " високосный.");
        else
            System.out.println("Год " + year + " не високосный.");

    }
}

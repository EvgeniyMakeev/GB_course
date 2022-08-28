package JavaBasics.lesson_01;

import java.util.Scanner;

public class Calc_4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Введите первое чило: ");
        int a = userInput.nextInt();

        System.out.print("Введите второе чило: ");
        int b = userInput.nextInt();
        userInput.close();

        int x = a + b;

        if (x >= 10 && x <= 20)
            System.out.println("True");
        else
            System.out.println("False");
        }
}
package JavaBasics.lesson_01;

import java.util.Scanner;

public class Calc_5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Введите чило: ");

        int a = userInput.nextInt();

        if (a >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }
}
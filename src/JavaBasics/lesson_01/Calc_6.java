package JavaBasics.lesson_01;

import java.util.Scanner;

public class Calc_6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Как вас зовут? ");

        String name = userInput.nextLine();

        System.out.println("Привет, " + name + "!");
    }
}
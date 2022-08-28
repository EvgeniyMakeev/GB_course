package JavaBasics.lesson_01;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите ограниечени: ");
        int limit = userInput.nextInt();

        userInput.close();

        int counter = 0;
        System.out.println("Список чётных чисел из заданного промежутка: ");
        while(counter <= limit) {
            if(counter % 2 == 0) {
                System.out.println(counter);
            }

            counter++;
        }
        System.out.println("Вот и всё.");

    }
}

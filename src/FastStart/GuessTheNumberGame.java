package FastStart;

import java.util.Scanner;

public class GuessTheNumberGame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello! Let's play the game!");
        for(int i = 10; i <= 30; i += 10) playLavel(i);
        System.out.println("You WIN!");
        scanner.close();
    }

    private static void playLavel(int range) {
        int number = (int) (Math.random() * range);
        while (true){
            System.out.println("Try to guess the number from 0 to " + range);
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("You guessed!");
                break;
            } else if (inputNumber > number) {
                System.out.println("The hidden number is less.");
            } else {
                System.out.println("The hidden number is greater.");
            }
        }
    }
}

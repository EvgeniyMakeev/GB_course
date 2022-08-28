package FastStart;

import java.util.Scanner;

public class scanNumber {
    public static void main(String[] args) {
        System.out.println("Введи число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Твоя \"a\" это " + a);
    }
}

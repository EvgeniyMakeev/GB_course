package JavaBasics.lesson_02;// Задать одномерный массив и найти в нем минимальный и максимальный элементы

/*
  Задание: Задать одномерный массив и найти в нем минимальный
  и максимальный элементы (без помощи интернета);
 */

public class HW5 {
    public static void main (String[] args) {
        int[] mas = {9, 1, 6, 4, 3, 8};
          if ((mas[0] < mas[1]) && (mas[0] < mas[2]) && (mas[0] < mas[3]) && (mas[0] < mas[4]) && (mas[0] < mas[5])) {
            System.out.println("Минимальный элемент массива: " +mas[0]);
        }
          if ((mas[1] < mas[0]) && (mas[1] < mas[2]) && (mas[1] < mas[3]) && (mas[1] < mas[4]) && (mas[1] < mas[5])) {
            System.out.println("Минимальный элемент массива: " +mas[1]);
        }
        if ((mas[2] < mas[1]) && (mas[2] < mas[0]) && (mas[2] < mas[3]) && (mas[2] < mas[4]) && (mas[2] < mas[5])) {
            System.out.println("Минимальный элемент массива: " +mas[2]);
        }
        if ((mas[3] < mas[0]) && (mas[3] < mas[2]) && (mas[3] < mas[0]) && (mas[3] < mas[4]) && (mas[3] < mas[5])) {
            System.out.println("Минимальный элемент массива: " +mas[3]);
        }
        if ((mas[4] < mas[1]) && (mas[4] < mas[2]) && (mas[4] < mas[3]) && (mas[4] < mas[0]) && (mas[4] < mas[5])) {
            System.out.println("Минимальный элемент массива: " +mas[4]);
        }
        if ((mas[5] < mas[0]) && (mas[5] < mas[2]) && (mas[5] < mas[3]) && (mas[5] < mas[4]) && (mas[5] < mas[0])) {
            System.out.println("Минимальный элемент массива: " +mas[5]);
        }
        if ((mas[0] > mas[1]) && (mas[0] > mas[2]) && (mas[0] > mas[3]) && (mas[0] > mas[4]) && (mas[0] > mas[5])) {
            System.out.println("Максимальный элемент массива: " +mas[0]);
        }
        if ((mas[1] > mas[0]) && (mas[1] > mas[2]) && (mas[1] > mas[3]) && (mas[1] > mas[4]) && (mas[1] > mas[5])) {
            System.out.println("Максимальный элемент массива: " +mas[1]);
        }
        if ((mas[2] > mas[1]) && (mas[2] > mas[0]) && (mas[2] > mas[3]) && (mas[2] > mas[4]) && (mas[2] > mas[5])) {
            System.out.println("Максимальный элемент массива: " +mas[2]);
        }
        if ((mas[3] > mas[0]) && (mas[3] > mas[2]) && (mas[3] > mas[0]) && (mas[3] > mas[4]) && (mas[3] > mas[5])) {
            System.out.println("Максимальный элемент массива: " +mas[3]);
        }
        if ((mas[4] > mas[1]) && (mas[4] > mas[2]) && (mas[4] > mas[3]) && (mas[4] > mas[0]) && (mas[4] > mas[5])) {
            System.out.println("Максимальный элемент массива: " +mas[4]);
        }
        if ((mas[5] > mas[0]) && (mas[5] > mas[2]) && (mas[5] > mas[3]) && (mas[5] > mas[4]) && (mas[5] > mas[0])) {
            System.out.println("Максимальный элемент массива: " +mas[5]);
        }
    }
}

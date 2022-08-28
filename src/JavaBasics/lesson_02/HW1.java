package JavaBasics.lesson_02;

/*
  Задание: Задать целочисленный массив, состоящий из элементов 0 и 1.
  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
  С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */

public class HW1 {
    public static void main (String[] args) {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i <= 9; i++) {
            if (mass[i] == 0)
                mass[i]++;
            else mass[i]--;
            System.out.println(mass[i]);
        }
    }
}

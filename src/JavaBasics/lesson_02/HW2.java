package JavaBasics.lesson_02;

/*
  Задание: Задать пустой целочисленный массив размером 8.
  С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
 */

public class HW2 {
    public static void main(String[] args) {
        int[] mass = new int[8];
        int[] newmass = { 0, 3, 6, 9, 12, 15, 18, 21};
        mass = newmass;

        for (int i = 0; i < mass.length; i++) {

        System.out.println(mass[i]);
        }
    }
}
package JavaBasics.lesson_02;

/*
  Задание: Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
  и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
 */

public class HW4 {
    public static void main(String[] args) {
        int[][] table = new int[5][5];
        table[0][0] = 1;
        table[1][0] = 0;
        table[2][0] = 0;
        table[3][0] = 0;
        table[4][0] = 1;
        table[0][1] = 0;
        table[1][1] = 1;
        table[2][1] = 0;
        table[3][1] = 1;
        table[4][1] = 0;
        table[0][2] = 0;
        table[1][2] = 0;
        table[2][2] = 1;
        table[3][2] = 0;
        table[4][2] = 0;
        table[0][3] = 0;
        table[1][3] = 1;
        table[2][3] = 0;
        table[3][3] = 1;
        table[4][3] = 0;
        table[0][4] = 1;
        table[1][4] = 0;
        table[2][4] = 0;
        table[3][4] = 0;
        table[4][4] = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            }
        }
        printArr(table);

    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

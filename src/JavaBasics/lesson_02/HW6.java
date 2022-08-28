package JavaBasics.lesson_02;

/* Задание: Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место,
в котором сумма левой и правой части массива равны.
Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят;
*/

public class HW6 {
    public static void main (String[] args) {
        int[] mas = {5, 8, 2, 11, 4};

        if (mas[0] == (mas[1] + mas[2] + mas[3] + mas[4])) {
            boolean bool = true;
            System.out.println("checkBalance - " + bool + "\t" + mas[0] + " || " + mas[1] + " " + mas[2] + " " + mas[3] + " " + mas[4]);
        }
        else if ((mas[0] + mas[1]) == (mas[2] + mas[3] + mas[4])) {
            boolean bool = true;
            System.out.println("checkBalance - " + bool + "\t" + mas[0] + " " + mas[1] + " || " + mas[2] + " " + mas[3] + " " + mas[4]);
        }
        else if ((mas[0] + mas[1] + mas[2]) == (mas[3] + mas[4])) {
            boolean bool = true;
            System.out.println("checkBalance - " + bool + "\t" + mas[0] + " " + mas[1] + " " + mas[2] + " || " + mas[3] + " " + mas[4]);
        }
        else if ((mas[0] + mas[1] + mas[2] + mas[3]) == mas[4]) {
            boolean bool = true;
            System.out.println("checkBalance - " + bool + "\t" + mas[0] + " " + mas[1] + " " + mas[2] + " " + mas[3] + " || " + mas[4]);
        }
        else {
            boolean bool = false;
            System.out.println("checkBalance - " + bool + "\t" + "Равновесия не найдено.");
        }
    }
}



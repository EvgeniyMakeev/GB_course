package JavaBasics.lesson_01;

public class Calc_3 {
    public static void main(String[] args){
        int x = getCalc();
        System.out.println(x);
    }
    static int getCalc() {
        int a = 7;
        int b = 25;
        int c = 9;
        int d = 3;
        return a * (b + (c / d));
    }
}

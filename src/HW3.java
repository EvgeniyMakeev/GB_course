public class HW3 {
    public static void main(String[] args) {
        int[] mass = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int x = 2;
        for (int o : mass) {
            if (o < 6)
            o = o*x;
        System.out.println(o);
        }
    }
}


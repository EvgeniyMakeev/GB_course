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

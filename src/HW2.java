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
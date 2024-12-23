public class Print_Power {
    public static int powerN(int n, int p) {
        if (p == 0) {
            return 1;
        }
        int pn = powerN(n, p - 1);
        return pn * n;

    }

    public static void main(String[] args) {
        int n = 5;
        int p = 4;
        System.out.println(powerN(n, p));

    }
}

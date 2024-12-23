


public class Tilling {
    public static int tillingProb(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
    
        int hrs = tillingProb(n - 1);
        int vrs = tillingProb(n - 2);
        return hrs + vrs;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tillingProb(n));
    }
}

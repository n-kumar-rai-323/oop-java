public class Print_Nth_Fibonacci_num {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int f1 = fib(n - 1);
        int f2 = fib(n - 2);
        return f1 + f2;
    }

    public static void main(String[] args) {
        int n = 5;
    System.out.println(fib(n));
    }
}

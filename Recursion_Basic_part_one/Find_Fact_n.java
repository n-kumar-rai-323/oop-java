public class Find_Fact_n {
    public static int factN(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = factN(n-1);
        // int fn = n * factN(n-1);
        int fn = n *fnm1;
        return fn;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(factN(n));
    }
}

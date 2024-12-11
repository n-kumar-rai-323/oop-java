public class Print_num_inc_ord {
    public static void prinIncr(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
       
        prinIncr(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        prinIncr(n);
    }
}

public class Print_Sum_Natural {
    public static int nNatural(int n){
        if(n ==1){
            return 1;
        }
        int lessNum = nNatural(n-1);
        int addNum = n + lessNum;
        return addNum;
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(nNatural(num));

    }
    
}

// Print numbers in decreasing order

public class Print_num_dec_ord {
public static void printDec(int n){
    if(n ==1){
        System.out.println(n);
        return;
    }
    System.out.println(n + " ");
    printDec(n-1);
}
    public static void main(String[] args) {
        int n =10;
        printDec(n);
        
    }
}

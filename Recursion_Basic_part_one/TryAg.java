public class TryAg {
    public static void printData(int n){
        if(n ==1){
            System.out.println("1");
            return;
        }
        System.out.println(n + " ");
        printData(n-1);
    }
    public static void main(String[] args) {
        int n =10;
        printData(n);
    }
}

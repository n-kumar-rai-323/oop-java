public class Last_Occurence {
    public static int lastOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int ifFound = lastOccurence(arr, key, i+1);
        if(ifFound == -1 && arr[i]==key){
            return i;
        }

        return ifFound;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,5};
        int key = 5;
        System.out.println(lastOccurence(arr, key, 0));
    }
}

public class First_Occurence {
    public static int fistOccurence(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fistOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int key = 6;
        System.out.println(fistOccurence(arr, key, 0));
    }
}

public class rec3{
    public static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }else{
            return isSorted(arr, i+1);
        }
    }
    public static int firstOcc(int arr[], int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    public static void main(String[] args){
        int i = 5;
        int arr[] = {1, 2, 3, 5, 4, 6, 7, 4};
        //System.out.println(isSorted(arr, 0));
        int key = 4;
        System.out.println(firstOcc(arr, key, 0));
    }
}

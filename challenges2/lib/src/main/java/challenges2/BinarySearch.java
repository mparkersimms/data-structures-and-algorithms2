package challenges2;

public class BinarySearch {
    public static int binarySearch(int[] arr, int search) {
        int lowNumber = 0;
        int highNumber = arr.length - 1;
        while (lowNumber <= highNumber) {
            int mid = (lowNumber + highNumber) / 2;
            if (search == arr[mid]) {
                return mid;
            }else if (search < arr[mid]){
                highNumber = mid -1;
            }else{
                lowNumber = mid +1;
            }

        }
        return -1;
    }
}

//In class Activity.
//Name : Swapnaroop Dattatray Salgare.
//CWID :20025439.

public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int key) {
        return binarySearch(arr, key, 0, arr.length - 1);
    }
    private static int binarySearch(int[] arr, int key, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                return binarySearch(arr, key, low, mid - 1);
            }
            return binarySearch(arr, key, mid + 1, high);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40, 80, 100 };
        int key = 80;
        int result = recursiveBinarySearch(arr, key);
        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + result);
        }
    }
}


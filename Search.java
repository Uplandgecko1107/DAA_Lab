public class Search {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;

        // Linear Search
        int linearResult = linearSearch(arr, target);
        System.out.println("Linear Search: Element " + target + 
            (linearResult != -1 ? " found at index " + linearResult : " not found"));

        // Binary Search
        int binaryResult = binarySearch(arr, target);
        System.out.println("Binary Search: Element " + target + 
            (binaryResult != -1 ? " found at index " + binaryResult : " not found"));
    }
}
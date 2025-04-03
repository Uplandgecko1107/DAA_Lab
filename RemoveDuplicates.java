public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        int[] result = new int[uniqueCount];
        System.arraycopy(arr, 0, result, 0, uniqueCount);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        System.out.println("Original array:");
        printArray(arr);

        int[] result = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        printArray(result);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
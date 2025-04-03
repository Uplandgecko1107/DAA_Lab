public class MergeSortedArrays {
    public static int[] merge(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        
        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }
        
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};
        
        System.out.println("First array:");
        printArray(nums1);
        System.out.println("Second array:");
        printArray(nums2);
        
        int[] result = merge(nums1, nums2);
        System.out.println("Merged array:");
        printArray(result);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
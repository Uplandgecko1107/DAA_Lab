public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        
        int right = 1;
        for (int i = n-1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Input array:");
        printArray(nums);
        
        int[] result = productExceptSelf(nums);
        System.out.println("Product of array except self:");
        printArray(result);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
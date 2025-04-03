public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Find first occurrence
        result[0] = findPosition(nums, target, true);
        if (result[0] == -1) {
            return result;
        }
        
        // Find last occurrence
        result[1] = findPosition(nums, target, false);
        
        return result;
    }
    
    private static int findPosition(int[] nums, int target, boolean first) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                result = mid;
                if (first) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
        int[] result = searchRange(nums, target);
        System.out.println("Range for target " + target + ": [" + 
            result[0] + ", " + result[1] + "]");
    }
}
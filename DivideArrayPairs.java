public class DivideArrayPairs {
    public static boolean canDivideIntoEqualPairs(int[] nums) {
        if (nums.length % 2 != 0) return false;
        
        java.util.HashMap<Integer, Integer> count = new java.util.HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        for (int value : count.values()) {
            if (value % 2 != 0) return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 2, 2};
        System.out.println("Array:");
        printArray(nums);
        System.out.println("Can be divided into equal pairs: " + 
            canDivideIntoEqualPairs(nums));
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
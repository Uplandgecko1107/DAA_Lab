public class SquareRoot {
    public static int sqrt(int x) {
        if (x == 0) return 0;
        
        long left = 1;
        long right = x;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            
            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return (int) right;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println("Square root of " + x + " is: " + sqrt(x));
        
        x = 4;
        System.out.println("Square root of " + x + " is: " + sqrt(x));
        
        x = 16;
        System.out.println("Square root of " + x + " is: " + sqrt(x));
    }
}
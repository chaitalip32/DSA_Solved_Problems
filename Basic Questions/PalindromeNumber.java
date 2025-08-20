public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        // Step 1: Handle negatives and multiples of 10 (except 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        // Step 2: Reverse half of the number
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }

        // Step 3: Check equality (for even and odd digit cases)
        return (x == reversedHalf || x == reversedHalf / 10);
    }

    public static void main(String[] args) {
        int[] testCases = {121, -121, 10, 1221, 12321, 0};

        for (int x : testCases) {
            System.out.println("Input: " + x + " → Output: " + isPalindrome(x));
        }
    }
}

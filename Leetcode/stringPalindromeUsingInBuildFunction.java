public class stringPalindromeUsingInBuildFunction {

    public static int isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString()) ? 1 : 0;
    }

    public static void main(String[] args) {
        String s = "HelloolleH";
        System.out.println(isPalindrome(s));
    }
}

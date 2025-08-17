public class stringPalindrome {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloolleH");
        boolean isPalindrome=true;
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            if(frontChar!=backChar){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}

public class stringPalindromeUsingTwoPointers {

    public static int isPalindromeUtil(String s,int left,int right){

        if(left>right){
            return 1;
        }

        if(s.charAt(left)!=s.charAt(right)){
            return 0;
        }

        return isPalindromeUtil(s,left+1,right-1);
    }
    public static int isPalindrome(String s){
        int left=0;
        int right=s.length()-1;

        return isPalindromeUtil(s,left,right);
    }
    public static void main(String[] args) {
        String s="HelloolleH";
        System.out.println(isPalindrome(s));
    }
}

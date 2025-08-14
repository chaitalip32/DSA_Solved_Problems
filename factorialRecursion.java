import java.util.*;
public class factorialRecursion {
    public static int factorial(int n){
    
        int fact=1;
        fact*=factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        
        int n=5;
        factorial(n);
    }
}

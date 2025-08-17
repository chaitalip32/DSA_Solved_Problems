public class factorialUsingRecursion {
    static int factorial(int num){
        if(num==0)
            return 1;
        
            return num*factorial(num-1);
    }
    public static void main(String[] args){
        int num=5;
        System.out.print("Factorial of "+num+" is "+factorial(num));
    }
}

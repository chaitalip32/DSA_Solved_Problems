public class factorialSimple {

    public static void main(String[] args) {
        int n=5;
        int fact=1;
        if(n==1)
            fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }

        System.out.println("Factorial of "+n+" is "+fact);
    }
}

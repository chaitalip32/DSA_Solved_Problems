public class factorialSimple {

    public static void main(String[] args) {
        int n=5;
        int fact=1;
        if(n==1 || n==0)
            fact=1;
        for(int i=n;i>=2;i--){
            fact=fact*i;
        }

        System.out.println("Factorial of "+n+" is "+fact);
    }
}

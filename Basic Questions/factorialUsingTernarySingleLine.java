public class factorialUsingTernarySingleLine {

    int factorial(int n) {

        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        factorialUsingTernarySingleLine obj = new factorialUsingTernarySingleLine();
        int num = 5;
        System.out.print("Factorial of " + num + " is " + obj.factorial(num));
    }
}

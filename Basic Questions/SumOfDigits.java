public class SumOfDigits{
    public static void main(String[] args){
        int num=2345;
        int rem=0,sum=0;
        int temp=num;
        while(temp>0){
            rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        System.out.println("Sum of "+num+ " is "+sum);
    }
}
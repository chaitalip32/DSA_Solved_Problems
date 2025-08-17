public class Armstrong {
    public static void main(String[] args) {
        int num=1353;
        
        int rem=0,temp=num;
        double sum=0;
        
        while(temp>0){
            rem=temp%10;
            temp=temp/10;
            sum=sum+Math.pow(rem,3);
        }
        if(sum==num)
            System.out.println(num + " is Armstrong");
        else
            System.out.println(num + " is not Armstrong");
    }
}

import java.util.*;
class Main {
    
    public static int getlargest(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr={45,23,56,43,67,45,23,87};
        System.out.print(getlargest(arr));
    }
}